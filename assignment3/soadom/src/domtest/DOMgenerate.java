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
		
		Element studentEle=doc.createElement("ѧ��");
		Element studentNumEle=doc.createElement("ѧ��");
		Element personInfoEle=doc.createElement("������Ϣ");
		Element departmentIDEle=doc.createElement("�������ű��");
		Element studentNameEle=doc.createElement("����");
		Element identifyEle=doc.createElement("���֤���");
		Element sexEle=doc.createElement("�Ա�");
		Element courseAndGradeEle=doc.createElement("���޿γ̼��ɼ�");
		
		Element courseEle1=doc.createElement("���޿γ�");
		courseEle1.setAttribute("�γ̱��", "123456");	
		Element courseEle2=doc.createElement("���޿γ�");
		courseEle2.setAttribute("�γ̱��", "123457");
		Element courseEle3=doc.createElement("���޿γ�");
		courseEle3.setAttribute("�γ̱��", "123458");
		Element courseEle4=doc.createElement("���޿γ�");
		courseEle4.setAttribute("�γ̱��", "123459");
		Element courseEle5=doc.createElement("���޿γ�");
		courseEle5.setAttribute("�γ̱��", "123450");
		
		Element usualEle1=doc.createElement("ƽʱ�ɼ�");
		Element assignEle1=doc.createElement("��ҵ�ɼ�");
		Element midEle1=doc.createElement("���гɼ�");
		Element finalEle1=doc.createElement("��ĩ�ɼ�");
		Element complexEle1=doc.createElement("�����ɼ�");
		
		Element usualEle2=doc.createElement("ƽʱ�ɼ�");
		Element assignEle2=doc.createElement("��ҵ�ɼ�");
		Element midEle2=doc.createElement("���гɼ�");
		Element finalEle2=doc.createElement("��ĩ�ɼ�");
		Element complexEle2=doc.createElement("�����ɼ�");
		
		Element usualEle3=doc.createElement("ƽʱ�ɼ�");
		Element assignEle3=doc.createElement("��ҵ�ɼ�");
		Element midEle3=doc.createElement("���гɼ�");
		Element finalEle3=doc.createElement("��ĩ�ɼ�");
		Element complexEle3=doc.createElement("�����ɼ�");
		
		Element usualEle4=doc.createElement("ƽʱ�ɼ�");
		Element assignEle4=doc.createElement("��ҵ�ɼ�");
		Element midEle4=doc.createElement("���гɼ�");
		Element finalEle4=doc.createElement("��ĩ�ɼ�");
		Element complexEle4=doc.createElement("�����ɼ�");
		
		Element usualEle5=doc.createElement("ƽʱ�ɼ�");
		Element assignEle5=doc.createElement("��ҵ�ɼ�");
		Element midEle5=doc.createElement("���гɼ�");
		Element finalEle5=doc.createElement("��ĩ�ɼ�");
		Element complexEle5=doc.createElement("�����ɼ�");
		
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
        Element root = doc.createElement("ѧ���б�");
        doc.appendChild(root);
        Document document = builder.parse(new File("wujiayi.xml"));
        Node sampleNode = doc.importNode(document.getElementsByTagName("ѧ��").item(0), true);
        
        root.appendChild(sampleNode);
        
        addStudent(doc,root,"141250176","�ں�ǿ","��");
        addStudent(doc,root,"141250171","Ҧ��","��");
        addStudent(doc,root,"141250209","��С��","Ů");
        addStudent(doc,root,"141250028","������","��");
        addStudent(doc,root,"141250047","������","��");
        addStudent(doc,root,"141250132","���Ɉ�","��");
        addStudent(doc,root,"141250146","���Ӱ�","��");
        addStudent(doc,root,"141250122","̶��","Ů");
        addStudent(doc,root,"141250010","�»�","��");
        addStudent(doc,root,"141250009","�·�","��");
         
        Transformer t=TransformerFactory.newInstance().newTransformer();
        t.setOutputProperty(OutputKeys.INDENT,"yes");
        t.setOutputProperty(OutputKeys.METHOD, "xml");
        t.transform(new DOMSource(doc), new StreamResult(new FileOutputStream(new File("domgenerate.xml"))));
 
    }
 
	
	
}
