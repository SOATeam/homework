/**
 * StudentInfoManageBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl;

import fault.*;
import org.w3c.dom.*;
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



        Element student=document.createElement("jw:学生");
        Element stunum=document.createElement("jw:学号");
        stunum.setTextContent(addStudentIn.get个人基本信息().get学号());

        Element personinfo=document.createElement("jw:个人信息");
        Element stuname=document.createElement("nju:姓名");
        stuname.setTextContent(addStudentIn.get个人基本信息().get姓名());
        Element departnum=document.createElement("nju:所属部门编号");
        departnum.setTextContent(addStudentIn.get个人基本信息().get单位信息().get部门编号());
        Element id=document.createElement("nju:身份证编号");
        id.setTextContent("32128219809282410");
        Element sex=document.createElement("nju:性别");
        sex.setTextContent("男");
        Element courseandscore=document.createElement("jw:所修课程及成绩");

        Element course=document.createElement("jw:所修课程");
        course.setAttribute("课程编号",addStudentIn.get个人成绩().get单科成绩().get课程().get课程编号());
        Element pingshi=document.createElement("jw:平时成绩");
        pingshi.setTextContent(addStudentIn.get个人成绩().get单科成绩().get平时成绩());
        Element qimo=document.createElement("jw:期末成绩");
        qimo.setTextContent(addStudentIn.get个人成绩().get单科成绩().get期末成绩());
        Element zongping=document.createElement("jw:总评成绩");
        zongping.setTextContent(addStudentIn.get个人成绩().get单科成绩().get总评成绩());

        student.appendChild(stunum);
        student.appendChild(personinfo);
        personinfo.appendChild(departnum);
        personinfo.appendChild(stuname);
        personinfo.appendChild(id);
        personinfo.appendChild(sex);
        student.appendChild(courseandscore);
        courseandscore.appendChild(course);
        course.appendChild(pingshi);
        course.appendChild(qimo);
        course.appendChild(zongping);

        writeXML(document);

        //add
    }

    public void deleteStudentByStudentID(java.lang.String deleteByIDIn) throws java.rmi.RemoteException, InvalidStudentIDFault, StudentIDNotFoundFault {
        //在studentList.xml里删除这个学生

        Document document = getDocument();

        NodeList nodes = document.getDocumentElement().getElementsByTagName("jw:学生");
        Node temp;
        for (int i=0;i<nodes.getLength();i++){
            temp=nodes.item(i).getFirstChild();
            if (temp.getTextContent().equals(deleteByIDIn)){
                document.removeChild(temp);
                break;
            }
        }

        writeXML(document);
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

        Document document = getDocument();

        NodeList nodes = document.getDocumentElement().getElementsByTagName("jw:学生");
        Node temp;
        Node student;
        Node personinfo;
        for (int i=0;i<nodes.getLength();i++){
            student=nodes.item(i);
            temp=student.getFirstChild();
            if (temp.getTextContent().equals(modInfoIn.get学号())){
                NodeList childnodes=student.getChildNodes();
                for (int j=0;j<childnodes.getLength();j++) {
                    if (childnodes.item(j).toString().equals("个人信息")) {
                        personinfo=childnodes.item(j);
                        NodeList personchild=personinfo.getChildNodes();
                        for (int k=0;k<personchild.getLength();k++){
                            Node info=personchild.item(k);
                            switch (info.toString()){
                                case "nju:所属部门编号":
                                    info.setTextContent(modInfoIn.get单位信息().get部门编号());
                                    break;
                                case "nju:姓名":
                                    info.setTextContent(modInfoIn.get姓名());
                                    break;


                            }
                        }
                    }
                }
            }
        }
        return modInfoIn;
    }

}
