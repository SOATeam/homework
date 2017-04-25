package ass4;

/**
 * Created by Jiayiwu on 17/4/25.
 * Mail:wujiayi@lgdreamer.com
 * Change everywhere
 */
public class ScoreItem {


    private String studentID;
    private String score;

    public ScoreItem() {
    }

    public ScoreItem(String studentID, String score) {
        this.studentID = studentID;
        this.score = score;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
