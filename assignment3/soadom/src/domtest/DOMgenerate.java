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
		addcourse(doc,courseAndGradeEle,courseEle1,studentNum);
		addcourse(doc,courseAndGradeEle,courseEle2,studentNum);
		addcourse(doc,courseAndGradeEle,courseEle3,studentNum);
		addcourse(doc,courseAndGradeEle,courseEle4,studentNum);
		addcourse(doc,courseAndGradeEle,courseEle5,studentNum);
		
	}
	
	public static void addcourse(Document doc,Element courseListEle,Element courseEle,String studentNum){
		
		
		if(studentNum.equals("141250176")){
			Element usualEle1=doc.createElement("平时成绩");
			
			
			Element finalEle1=doc.createElement("期末成绩");
			Element complexEle1=doc.createElement("总评成绩");
			int usual=(int)(Math.round(Math.random()*100)*0.5);
			
			
			int fina=(int)(Math.round(Math.random()*100)*0.5);
			double temp=0.3*usual+0.7*fina;
			int complex=(int) temp;
			Text usualValue1=doc.createTextNode(String.valueOf(usual));
			
			Text finalValue1=doc.createTextNode(String.valueOf(fina));
			Text complexValue1=doc.createTextNode(String.valueOf(complex));
			
			courseListEle.appendChild(courseEle);
			courseEle.appendChild(usualEle1);
			
			courseEle.appendChild(finalEle1);
			courseEle.appendChild(complexEle1);
			usualEle1.appendChild(usualValue1);
			
			finalEle1.appendChild(finalValue1);
			complexEle1.appendChild(complexValue1);
		}else{
		Element usualEle1=doc.createElement("平时成绩");
		
		
		Element finalEle1=doc.createElement("期末成绩");
		Element complexEle1=doc.createElement("总评成绩");
		int usual=(int)Math.round(Math.random()*100);
		
		
		int fina=(int)Math.round(Math.random()*100);
		double temp=0.3*usual+0.7*fina;
		int complex=(int) temp;
		Text usualValue1=doc.createTextNode(String.valueOf(usual));
		
		Text finalValue1=doc.createTextNode(String.valueOf(fina));
		Text complexValue1=doc.createTextNode(String.valueOf(complex));
		
		courseListEle.appendChild(courseEle);
		courseEle.appendChild(usualEle1);
		
		courseEle.appendChild(finalEle1);
		courseEle.appendChild(complexEle1);
		usualEle1.appendChild(usualValue1);
		
		finalEle1.appendChild(finalValue1);
		complexEle1.appendChild(complexValue1);
		}
		
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
