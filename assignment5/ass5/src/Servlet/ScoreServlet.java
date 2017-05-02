package Servlet;

/**
 * Created by Jiayiwu on 17/5/2.
 * Mail:wujiayi@lgdreamer.com
 * Change everywhere
 */

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


/**
 * Servlet implementation class ReceiverServlet
 */
@WebServlet("/score/find")
public class ScoreServlet extends HttpServlet {



    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("id");
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
           message  = messageFactory.createMessage();
          soapEnvelope  = message.getSOAPPart().getEnvelope();
           SOAPHeader soapHeader = soapEnvelope.getHeader();

            SOAPHeaderElement soapHeaderElement = soapHeader.addHeaderElement(new QName("http://www.nju.edu.cn/schema","check","nju"));
            soapHeaderElement.setAttribute("SOAP-ENV:role","http://www.w3.org/2003/05/soap-envelope/role/next");
            soapHeaderElement.setMustUnderstand(false);
            soapHeaderElement.addChildElement(soapHeaderElement.createQName("checkCode","nju")).addTextNode("ef5193e84c0b1c7d");

         soapBody  = soapEnvelope.getBody();
            soapBody.addNamespaceDeclaration("tns","http://jw.nju.edu.cn/schema");
            soapBody.addNamespaceDeclaration("nju","http://www.nju.edu.cn/schema");
            if (null == id){
                faultFactory(new QName("SOAP-ENV","client"),"400:请求参数错误",soapBody);
            }
            Student student = InitUtil.indexStudent(Integer.parseInt(id));
            if (null == student)
                faultFactory(new QName("SOAP-ENV","client"),"404:相关学号没有找到",soapBody);

            SOAPBodyElement element = soapBody.addBodyElement(new QName("tns","学生"));
            element.addChildElement( element.createQName("学号","tns")).addTextNode(student.getId()+ "");
            element.addChildElement( element.createQName("姓名","tns")).addTextNode(student.getName());

            SOAPElement courses = element.addChildElement( element.createQName("成绩信息","tns"));

            List<Course> list = student.getList();

            for (Course tem :list){
                courses.addChildElement( courses.createQName("课程编号","tns")).addTextNode(tem.getId()+"");
                courses.addChildElement( courses.createQName("课程名称","tns")).addTextNode(tem.getName());
                courses.addChildElement( courses.createQName("课程成绩","tns")).addTextNode(tem.getScore()+"");
            }

        } catch (SOAPException e) {
            try {
                faultFactory(new QName("SOAP-ENV","server"),"500:服务器错误",soapBody);

            } catch (SOAPException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            message.writeTo(response.getOutputStream());
        } catch (SOAPException e) {
            e.printStackTrace();
        }

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

    private SOAPFault faultFactory(QName qName,String message,SOAPBody soapBody) throws SOAPException {
        SOAPFault soapFault = soapBody.addFault();
        soapFault.setFaultCode(qName);
        soapFault.setFaultString(message,Locale.CHINESE);
        return soapFault;
    }

}

