/**
 * StudentInfoManageBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl;

import fault.*;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import schema.个人基本信息类型;
import schema.单位信息类型;
import schema.学生类型;
import service.StudentInfoManageInterface;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.net.URL;

public class StudentInfoManageBindingImpl implements StudentInfoManageInterface {

    private Document getDocument(){
        URL url = getClass().getResource("");
        String filePath = url.getPath().replace("WEB-INF/classes/wsdl", "");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setIgnoringElementContentWhitespace(true);

        Document document=null;
        try{
            DocumentBuilder builder = factory.newDocumentBuilder();
            document = builder.parse(filePath + "StudentList.xml");
            //score = document.getDocumentElement();
        } catch(Exception e){
            e.printStackTrace();
        }
        return document;
    }

    private String writeXML(Document document){
        URL url = getClass().getResource("");
        String filePath = url.getPath().replace("WEB-INF/classes/wsdl", "");

        try{
            TransformerFactory tFactory = TransformerFactory.newInstance();
            Transformer transformer = tFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File(filePath + "Student.xml"));
            transformer.transform(source, result);
            return "操作成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "操作失败： " + e.getMessage();
        }
    }
    public void addStudent(学生类型 addStudentIn) throws java.rmi.RemoteException, InvalidStudentFault {
        //在studentList.xml里加上这个学生
        Document document = getDocument();
        //add
    }

    public void deleteStudentByStudentID(java.lang.String deleteByIDIn) throws java.rmi.RemoteException, InvalidStudentIDFault, StudentIDNotFoundFault {
        //在studentList.xml里删除这个学生
        //remove
    }

    public 个人基本信息类型 getStudentInfoByStudentID(java.lang.String getInfoByIdIn) throws java.rmi.RemoteException, InvalidStudentIDFault, StudentIDNotFoundFault {
        Document document = getDocument();
        NodeList nodes = document.getDocumentElement().getElementsByTagName("tns：学号");
        for (int i=0;i<nodes.getLength();i++){
        }
        NamedNodeMap nodeAttr = nodes.item(0).getAttributes();
        个人基本信息类型 personInfo=new 个人基本信息类型();
        personInfo.set单位信息(new 单位信息类型());

        return personInfo;
    }

    public 个人基本信息类型 getStudentInfoByStudentName(java.lang.String getInfoByNameIn) throws java.rmi.RemoteException, StudentNameNotFoundFault {
        Document document = getDocument();
        NodeList nodes = document.getDocumentElement().getElementsByTagName("tns：姓名");
        for (int i=0;i<nodes.getLength();i++){
        }
        NamedNodeMap nodeAttr = nodes.item(0).getAttributes();
        个人基本信息类型 personInfo=new 个人基本信息类型();
        personInfo.set单位信息(new 单位信息类型());

        return personInfo;

    }

    public 个人基本信息类型 modifyStudentInfo(个人基本信息类型 modInfoIn) throws java.rmi.RemoteException, StudentNameNotFoundFault, InvalidStudentInfoFault {

        return modInfoIn;
    }

}
