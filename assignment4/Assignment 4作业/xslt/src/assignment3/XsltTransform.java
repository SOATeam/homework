package assignment3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XsltTransform {

	public static void transformXmlByXslt(String srcXml, String dstXml, String xslt) {  
        
        // ��ȡת��������  
        TransformerFactory tf = TransformerFactory.newInstance();  
          
        try {  
            // ��ȡת��������ʵ��  
            Transformer transformer = tf.newTransformer(new StreamSource(xslt));  
            // ����ת��  
            transformer.transform(new StreamSource(srcXml),  
                    new StreamResult(new FileOutputStream(dstXml)));  
            
        } catch (TransformerConfigurationException e) {  
            e.printStackTrace();  
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (TransformerException e) {  
            e.printStackTrace();  
        }  
    }  
      
      
    public static void main(String[] args) {  
        String srcXml = "src/StudentList.xml";  
        String dstXml = "src/ScoreList.xml";  
        String xslt = "src/MyNewStylesheet.xsl";  
          
        transformXmlByXslt(srcXml, dstXml, xslt);  
    }  
    
}
