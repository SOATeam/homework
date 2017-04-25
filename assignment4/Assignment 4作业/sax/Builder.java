package ass4;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by Jiayiwu on 17/4/24.
 * Mail:wujiayi@lgdreamer.com
 * Change everywhere
 */
public class Builder {


    public static void build(String filePath, List<CourseItem> list){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        Document doc = builder.newDocument();
        Element root = doc.createElement("课程成绩列表");
        root.setAttribute("xmlns","http://jw.nju.edu.cn/schema");
        doc.appendChild(root);
        for (CourseItem tem :list){
            Element course = doc.createElement("课程成绩");
            course.setAttribute("课程编号",tem.getCourseID());
            course.setAttribute("成绩性质",tem.getCourseProperty());
            List<ScoreItem> scoreItemList = tem.getList();

            for (ScoreItem tem1 : scoreItemList){
                Element mainScore = doc.createElement("成绩");
                Element studentid = doc.createElement("学号");
                Text idText = doc.createTextNode(tem1.getStudentID());
                studentid.appendChild(idText);

                Element score = doc.createElement("得分");
                Text scoreText = doc.createTextNode(tem1.getScore());
                score.appendChild(scoreText);

                mainScore.appendChild(studentid);
                mainScore.appendChild(score);
                course.appendChild(mainScore);
            }
            root.appendChild(course);
        }

        Transformer t = null;
        try {
            t = TransformerFactory.newInstance().newTransformer();
        } catch (TransformerConfigurationException
                | TransformerFactoryConfigurationError e) {
            e.printStackTrace();
        }
        //设置换行和缩进
        t.setOutputProperty(OutputKeys.INDENT,"yes");
        t.setOutputProperty(OutputKeys.METHOD, "xml");
        try {
            t.transform(new DOMSource(doc), new StreamResult(new FileOutputStream(new File(filePath))));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
