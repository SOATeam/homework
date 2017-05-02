package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jiayiwu on 17/5/2.
 * Mail:wujiayi@lgdreamer.com
 * Change everywhere
 */
public class Student {

    private int id;
    private String name;
    private List<Course> list = new ArrayList<Course>();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getList() {
        return list;
    }

    public void setList(List<Course> list) {
        this.list = list;
    }
}
