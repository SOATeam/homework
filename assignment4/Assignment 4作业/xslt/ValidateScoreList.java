package assignment3;

import java.io.File;
import java.io.IOException;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class ValidateScoreList {

	private ValidateScoreList() {

    }

	public static boolean validateXml(String xsdPath, String xmlPath) throws SAXException, IOException {

		SchemaFactory schemaFactory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
		
		File schemaFile = new File(xsdPath);

		Schema schema = schemaFactory.newSchema(schemaFile);
		
		Validator validator = schema.newValidator();

		Source source = new StreamSource(xmlPath);
		
		validator.validate(source);

		return true;
	}

	public  static void main(String[] args){
		String srcXml = "src/ScoreList.xml";  
		String xsd="src/list/ScoreList.xsd";
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
