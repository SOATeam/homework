package ass4;



import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Jiayiwu on 17/4/23.
 * Mail:wujiayi@lgdreamer.com
 * Change everywhere
 */
public class SAX {
    public static void main(String agrs[]) throws IOException, SAXException {
        if(validateXml("ScoreList.xsd","ScoreList.xml")) {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = null;
            try {
                saxParser = factory.newSAXParser();
            } catch (ParserConfigurationException e) {
                e.printStackTrace();
            } catch (SAXException e) {
                e.printStackTrace();
            }
            FindFailScoreHandler handler = new FindFailScoreHandler();
            try {
                saxParser.parse(new File("ScoreList.xml"), handler);

            } catch (SAXException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            List<CourseItem> list = handler.getList();
            list.add(handler.getCourseItem());

            Builder builder = new Builder();
            builder.build("FailScoreList.xml", list);
        }

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
}
