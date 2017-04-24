package assignment3;

import java.io.File;
import java.io.IOException;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class ValidateStudentList {

	private ValidateStudentList() {

    }

	public static boolean validateXml(String xsdPath, String xmlPath) throws SAXException, IOException {
		// ����schema����
		SchemaFactory schemaFactory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
		// ������֤�ĵ��ļ��������ô��ļ���������װ���ļ�����schema��֤
		File schemaFile = new File(xsdPath);
		// ����schema������������֤�ĵ��ļ���������Schema����
		Schema schema = schemaFactory.newSchema(schemaFile);
		// ͨ��Schema��������ڴ�Schema����֤��������schenaFile������֤
		Validator validator = schema.newValidator();
		// �õ���֤������Դ
		Source source = new StreamSource(xmlPath);
		// ��ʼ��֤���ɹ����success!!!��ʧ�����fail
		validator.validate(source);

		return true;
	}

	public  static void main(String[] args){
		String srcXml = "src/StudentList.xml";  
		String xsd="src/list/StudentList.xsd";
		try {
			System.out.println(validateXml(xsd,srcXml));
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
