package ass4;



import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jiayiwu on 17/4/23.
 * Mail:wujiayi@lgdreamer.com
 * Change everywhere
 */
public class FindFailScoreHandler extends DefaultHandler{

    private CourseItem courseItem = new CourseItem();
    private String tag = null;
    private String courseid = null;
    private String courseProperty = null;
    private List<CourseItem> list = new ArrayList<>();
    private String studentID = null;
    private String studentScore = null;


    public FindFailScoreHandler(){
    }

    @Override
    public void startDocument() throws SAXException {

        super.startDocument();
    }

    @Override
    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {
        tag = qName;
        if (attributes.getValue("课程编号")!=null)
            courseid = attributes.getValue("课程编号");
        if (attributes.getValue("成绩性质")!=null)
            courseProperty = attributes.getValue("成绩性质");

        super.startElement(uri, localName, qName, attributes);
    }

    @Override
    public void characters(char[] ch, int start, int length)
            throws SAXException {
        String value = new String(ch,start,length);
        if (!value.startsWith("\n")){
            switch (tag){
                case "学号":
                    studentID = value;
                    break;
                case "得分":
                    studentScore = value;
                    if (studentID!=null&&studentScore!=null) {
                        if (Integer.parseInt(studentScore)<60)
                            courseItem.addScoreItem(new ScoreItem(studentID, studentScore));
                    }
                    break;

            }
        }else {
            switch (tag){
                case "课程成绩":
                    if (courseItem.getCourseID() == null && courseItem.getCourseProperty() == null) {
                        courseItem.setCourseID(courseid);
                        courseItem.setCourseProperty(courseProperty);
                    }else if ((!courseItem.getCourseID().equals(courseid))||(!courseItem.getCourseProperty().equals(courseProperty))){
                        list.add(courseItem);
                        courseItem = new CourseItem(courseid,courseProperty);
                    }
                    break;
            }
        }


        super.characters(ch, start, length);
    }

    public CourseItem getCourseItem() {
        return courseItem;
    }

    public void setCourseItem(CourseItem courseItem) {
        this.courseItem = courseItem;
    }

    public List<CourseItem> getList() {
        return list;
    }

    public void setList(List<CourseItem> list) {
        this.list = list;
    }
}
