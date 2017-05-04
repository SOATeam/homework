package Servlet;

/**
 * Created by Jiayiwu on 17/5/2.
 * Mail:wujiayi@lgdreamer.com
 * Change everywhere
 */

//import org.jdom.input.SAXBuilder;
//import org.jdom.Document;
//import org.jdom.Element;
//import org.jdom.JDOMException;
//import org.jdom.output.XMLOutputter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import Model.Course;
import Model.Student;
import util.InitUtil;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;
import javax.xml.soap.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Locale;


/**
 * Servlet implementation class ReceiverServlet
 */
@WebServlet("/score/find")
public class ScoreServlet extends HttpServlet {


    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
//        getInfo(reqMsg);
        InputStream input = request.getInputStream();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            // ❷Ⅱ获得DocumentBuilder
            DocumentBuilder builder = factory.newDocumentBuilder();
            // ❸Ⅲ--获得文档对象--
            Document doc = builder.parse(input);
            // ❹Ⅳ获得根元素
            String studentID = doc.getElementsByTagName("学号").item(0).getFirstChild().getNodeValue();
            String courseID = doc.getElementsByTagName("课程编号").item(0).getFirstChild().getNodeValue();
            String score = doc.getElementsByTagName("新成绩").item(0).getFirstChild().getNodeValue();

            request.setAttribute("studentID", studentID);
            request.setAttribute("courseID", courseID);
            request.setAttribute("score", score);
            dealmodify(request, response);


        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void dealmodify(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getAttribute("studentID").toString();
        request.setCharacterEncoding("utf-8");
        response.setContentType("application/soap+xml;charset=utf-8");
        response.setHeader("Content-Disposition", "attachment; filename=score.xml");
        MessageFactory messageFactory = null;

        try {
            messageFactory = MessageFactory.newInstance();
        } catch (SOAPException e) {
            e.printStackTrace();
        }

        SOAPMessage message = null;
        SOAPEnvelope soapEnvelope = null;
        SOAPBody soapBody = null;
        try {
            message = messageFactory.createMessage();
            soapEnvelope = message.getSOAPPart().getEnvelope();
            SOAPHeader soapHeader = soapEnvelope.getHeader();

            SOAPHeaderElement soapHeaderElement = soapHeader.addHeaderElement(new QName("http://www.nju.edu.cn/schema", "check", "nju"));
            soapHeaderElement.setAttribute("SOAP-ENV:role", "http://www.w3.org/2003/05/soap-envelope/role/next");
            soapHeaderElement.setMustUnderstand(false);
            soapHeaderElement.addChildElement(soapHeaderElement.createQName("checkCode", "nju")).addTextNode("ef5193e84c0b1c7d");

            soapBody = soapEnvelope.getBody();
            soapBody.addNamespaceDeclaration("tns", "http://jw.nju.edu.cn/schema");
            soapBody.addNamespaceDeclaration("nju", "http://www.nju.edu.cn/schema");
            if (null == id) {
                faultFactory(new QName("SOAP-ENV", "client"), "400:请求参数错误", soapBody);
            }
            Student student = InitUtil.indexStudent(Integer.parseInt(id));
            if (null == student)
                faultFactory(new QName("SOAP-ENV", "client"), "404:相关学号没有找到", soapBody);

            List<Course> list0 = student.getList();
            boolean isfind=false;
            for (Course tem : list0) {

                if (Integer.parseInt(request.getAttribute("courseID").toString()) == tem.getId()) {
                    tem.setScore(Double.parseDouble(request.getAttribute("score").toString()));
                    isfind=true;
                }
            }

            if(isfind==false)
                faultFactory(new QName("SOAP-ENV", "client"), "404:相关课程号没有找到", soapBody);


            SOAPBodyElement element = soapBody.addBodyElement(new QName("tns", "学生"));
            element.addChildElement(element.createQName("学号", "tns")).addTextNode(student.getId() + "");
            element.addChildElement(element.createQName("姓名", "tns")).addTextNode(student.getName());

            SOAPElement courses = element.addChildElement(element.createQName("成绩信息", "tns"));

            List<Course> list = student.getList();

            for (Course tem : list) {
                courses.addChildElement(courses.createQName("课程编号", "tns")).addTextNode(tem.getId() + "");
                courses.addChildElement(courses.createQName("课程名称", "tns")).addTextNode(tem.getName());
                courses.addChildElement(courses.createQName("课程成绩", "tns")).addTextNode(tem.getScore() + "");
            }

        } catch (SOAPException e) {
            try {
                faultFactory(new QName("SOAP-ENV", "server"), "500:服务器错误", soapBody);

            } catch (SOAPException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            message.writeTo(response.getOutputStream());
        } catch (SOAPException e) {
            e.printStackTrace();
        }

    }

    private SOAPFault faultFactory(QName qName, String message, SOAPBody soapBody) throws SOAPException {
        SOAPFault soapFault = soapBody.addFault();
        soapFault.setFaultCode(qName);
        soapFault.setFaultString(message, Locale.CHINESE);
        return soapFault;
    }

}

