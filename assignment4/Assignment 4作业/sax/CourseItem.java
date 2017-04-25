package ass4;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jiayiwu on 17/4/25.
 * Mail:wujiayi@lgdreamer.com
 * Change everywhere
 */
public class CourseItem {

    private String courseID;

    private String courseProperty;

    private List<ScoreItem> list =new ArrayList<ScoreItem>();

    public CourseItem() {
    }

    public CourseItem(String courseID, String courseProperty) {
        this.courseID = courseID;
        this.courseProperty = courseProperty;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseProperty() {
        return courseProperty;
    }

    public void setCourseProperty(String courseProperty) {
        this.courseProperty = courseProperty;
    }

    public void addScoreItem(ScoreItem scoreItem){
        list.add(scoreItem);
    }

    public List<ScoreItem> getList() {
        return list;
    }

    public void setList(List<ScoreItem> list) {
        this.list = list;
    }
}
