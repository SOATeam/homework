package domtest;
import java.io.File;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

public class DOMgenerate {
	public static void addStudent(Document doc,Element root,String studentNum,String name,String sex){
		
		Element studentEle=doc.createElement("学生");
		Element studentNumEle=doc.createElement("学号");
		Element personInfoEle=doc.createElement("个人信息");
		Element departmentIDEle=doc.createElement("所属部门编号");
		Element studentNameEle=doc.createElement("姓名");
		Element identifyEle=doc.createElement("身份证编号");
		Element sexEle=doc.createElement("性别");
		Element courseAndGradeEle=doc.createElement("所修课程及成绩");
		
		Element courseEle1=doc.createElement("所修课程");
		courseEle1.setAttribute("课程编号", "123456");	
		Element courseEle2=doc.createElement("所修课程");
		courseEle2.setAttribute("课程编号", "123457");
		Element courseEle3=doc.createElement("所修课程");
		courseEle3.setAttribute("课程编号", "123458");
		Element courseEle4=doc.createElement("所修课程");
		courseEle4.setAttribute("课程编号", "123459");
		Element courseEle5=doc.createElement("所修课程");
		courseEle5.setAttribute("课程编号", "123450");
		
		Element usualEle1=doc.createElement("平时成绩");
		Element assignEle1=doc.createElement("作业成绩");
		Element midEle1=doc.createElement("期中成绩");
		Element finalEle1=doc.createElement("期末成绩");
		Element complexEle1=doc.createElement("总评成绩");
		
		Element usualEle2=doc.createElement("平时成绩");
		Element assignEle2=doc.createElement("作业成绩");
		Element midEle2=doc.createElement("期中成绩");
		Element finalEle2=doc.createElement("期末成绩");
		Element complexEle2=doc.createElement("总评成绩");
		
		Element usualEle3=doc.createElement("平时成绩");
		Element assignEle3=doc.createElement("作业成绩");
		Element midEle3=doc.createElement("期中成绩");
		Element finalEle3=doc.createElement("期末成绩");
		Element complexEle3=doc.createElement("总评成绩");
		
		Element usualEle4=doc.createElement("平时成绩");
		Element assignEle4=doc.createElement("作业成绩");
		Element midEle4=doc.createElement("期中成绩");
		Element finalEle4=doc.createElement("期末成绩");
		Element complexEle4=doc.createElement("总评成绩");
		
		Element usualEle5=doc.createElement("平时成绩");
		Element assignEle5=doc.createElement("作业成绩");
		Element midEle5=doc.createElement("期中成绩");
		Element finalEle5=doc.createElement("期末成绩");
		Element complexEle5=doc.createElement("总评成绩");
		
		Text studentNameValue=doc.createTextNode(name);
		Text studentNumValue=doc.createTextNode(studentNum);
		Text departmentIDValue=doc.createTextNode("141250000");
		int ran=(int) (Math.random()*10);
		Text idendityValue=doc.createTextNode("32128219960920221"+String.valueOf(ran));
		Text sexValue=doc.createTextNode(sex);
		
		root.appendChild(studentEle);
		studentEle.appendChild(studentNumEle);
		studentNumEle.appendChild(studentNumValue);
		studentEle.appendChild(personInfoEle);
		personInfoEle.appendChild(departmentIDEle);
		departmentIDEle.appendChild(departmentIDValue);
		personInfoEle.appendChild(studentNameEle);
		studentNameEle.appendChild(studentNameValue);
		personInfoEle.appendChild(identifyEle);
		identifyEle.appendChild(idendityValue);
		personInfoEle.appendChild(sexEle);
		sexEle.appendChild(sexValue);
		studentEle.appendChild(courseAndGradeEle);
		courseAndGradeEle.appendChild(courseEle1);
		courseAndGradeEle.appendChild(courseEle2);
		courseAndGradeEle.appendChild(courseEle3);
		courseAndGradeEle.appendChild(courseEle4);
		courseAndGradeEle.appendChild(courseEle5);
		
		Text usualValue1=doc.createTextNode(String.valueOf(Math.random()*100));
		Text assiggValue1=doc.createTextNode(String.valueOf(Math.random()*100));
		Text midValue1=doc.createTextNode(String.valueOf(Math.random()*100));
		Text finalValue1=doc.createTextNode(String.valueOf(Math.random()*100));
		Text complexValue1=doc.createTextNode(String.valueOf(Math.random()*100));
		
		courseEle1.appendChild(usualEle1);
		courseEle1.appendChild(assignEle1);
		courseEle1.appendChild(midEle1);
		courseEle1.appendChild(finalEle1);
		courseEle1.appendChild(complexEle1);
		usualEle1.appendChild(usualValue1);
		assignEle1.appendChild(assiggValue1);
		midEle1.appendChild(midValue1);
		finalEle1.appendChild(finalValue1);
		complexEle1.appendChild(complexValue1);
		
		
		Text usualValue2=doc.createTextNode(String.valueOf(Math.random()*100));
		Text assiggValue2=doc.createTextNode(String.valueOf(Math.random()*100));
		Text midValue2=doc.createTextNode(String.valueOf(Math.random()*100));
		Text finalValue2=doc.createTextNode(String.valueOf(Math.random()*100));
		Text complexValue2=doc.createTextNode(String.valueOf(Math.random()*100));
		
		courseEle2.appendChild(usualEle2);
		courseEle2.appendChild(assignEle2);
		courseEle2.appendChild(midEle2);
		courseEle2.appendChild(finalEle2);
		courseEle2.appendChild(complexEle2);
		usualEle2.appendChild(usualValue2);
		assignEle2.appendChild(assiggValue2);
		midEle2.appendChild(midValue2);
		finalEle2.appendChild(finalValue2);
		complexEle2.appendChild(complexValue2);
		
		
		Text usualValue3=doc.createTextNode(String.valueOf(Math.random()*100));
		Text assiggValue3=doc.createTextNode(String.valueOf(Math.random()*100));
		Text midValue3=doc.createTextNode(String.valueOf(Math.random()*100));
		Text finalValue3=doc.createTextNode(String.valueOf(Math.random()*100));
		Text complexValue3=doc.createTextNode(String.valueOf(Math.random()*100));
		
		courseEle3.appendChild(usualEle3);
		courseEle3.appendChild(assignEle3);
		courseEle3.appendChild(midEle3);
		courseEle3.appendChild(finalEle3);
		courseEle3.appendChild(complexEle3);
		usualEle3.appendChild(usualValue3);
		assignEle3.appendChild(assiggValue3);
		midEle3.appendChild(midValue3);
		finalEle3.appendChild(finalValue3);
		complexEle3.appendChild(complexValue3);
		
		
		Text usualValue4=doc.createTextNode(String.valueOf(Math.random()*100));
		Text assiggValue4=doc.createTextNode(String.valueOf(Math.random()*100));
		Text midValue4=doc.createTextNode(String.valueOf(Math.random()*100));
		Text finalValue4=doc.createTextNode(String.valueOf(Math.random()*100));
		Text complexValue4=doc.createTextNode(String.valueOf(Math.random()*100));
		
		courseEle4.appendChild(usualEle4);
		courseEle4.appendChild(assignEle4);
		courseEle4.appendChild(midEle4);
		courseEle4.appendChild(finalEle4);
		courseEle4.appendChild(complexEle4);
		usualEle4.appendChild(usualValue4);
		assignEle4.appendChild(assiggValue4);
		midEle4.appendChild(midValue4);
		finalEle4.appendChild(finalValue4);
		complexEle4.appendChild(complexValue4);
		
		
		Text usualValue5=doc.createTextNode(String.valueOf(Math.random()*100));
		Text assiggValue5=doc.createTextNode(String.valueOf(Math.random()*100));
		Text midValue5=doc.createTextNode(String.valueOf(Math.random()*100));
		Text finalValue5=doc.createTextNode(String.valueOf(Math.random()*100));
		Text complexValue5=doc.createTextNode(String.valueOf(Math.random()*100));
		
		courseEle5.appendChild(usualEle5);
		courseEle5.appendChild(assignEle5);
		courseEle5.appendChild(midEle5);
		courseEle5.appendChild(finalEle5);
		courseEle5.appendChild(complexEle5);
		usualEle5.appendChild(usualValue5);
		assignEle5.appendChild(assiggValue5);
		midEle5.appendChild(midValue5);
		finalEle5.appendChild(finalValue5);
		complexEle5.appendChild(complexValue5);
		
	}
	
	public static void main(String[] args) throws Exception {
		 
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.newDocument();
        Element root = doc.createElement("学生列表");
        doc.appendChild(root);
        Document document = builder.parse(new File("wujiayi.xml"));
        Node sampleNode = doc.importNode(document.getElementsByTagName("学生").item(0), true);
        
        root.appendChild(sampleNode);
        
        addStudent(doc,root,"141250176","于海强","男");
        addStudent(doc,root,"141250171","姚朋","男");
        addStudent(doc,root,"141250209","周小帆","女");
        addStudent(doc,root,"141250028","丁银门","男");
        addStudent(doc,root,"141250047","何永俊","男");
        addStudent(doc,root,"141250132","王成垚","男");
        addStudent(doc,root,"141250146","王子安","男");
        addStudent(doc,root,"141250122","潭琼","女");
        addStudent(doc,root,"141250010","陈欢","男");
        addStudent(doc,root,"141250009","陈飞","男");
         
        Transformer t=TransformerFactory.newInstance().newTransformer();
        t.setOutputProperty(OutputKeys.INDENT,"yes");
        t.setOutputProperty(OutputKeys.METHOD, "xml");
        t.transform(new DOMSource(doc), new StreamResult(new FileOutputStream(new File("domgenerate.xml"))));
 
    }
 
	
	
}
