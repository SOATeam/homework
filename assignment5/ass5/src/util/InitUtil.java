package util;

import Model.Course;
import Model.Student;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by Jiayiwu on 17/5/2.
 * Mail:wujiayi@lgdreamer.com
 * Change everywhere
 */
public class InitUtil {

    private static Map<Integer, Student> map = new HashMap<Integer, Student>();

    static {
        Student student1 = new Student();
        student1.setId(141250150);
        student1.setName("伍佳艺");
        List<Course> list = new LinkedList<Course>();
        list.add(new Course(00013,"离散数学",90));
        list.add(new Course(00021,"微积分",96));
        list.add(new Course(00010,"计算机组织系统",99));
        list.add(new Course(00012,"计算机网络",100));
        student1.setList(list);
        map.put(141250150,student1);


        Student student2 = new Student();
        student2.setId(141250176);
        student2.setName("于海强");
        List<Course> list2 = new LinkedList<Course>();
        list2.add(new Course(00013,"离散数学",100));
        list2.add(new Course(00021,"微积分",91));
        list2.add(new Course(00010,"计算机组织系统",99));
        list2.add(new Course(00012,"计算机网络",100));
        student2.setList(list2);
        map.put(141250176,student2);


        Student student3 = new Student();
        student3.setId(141250171);
        student3.setName("姚朋");
        List<Course> list3 = new LinkedList<Course>();
        list3.add(new Course(00013,"离散数学",100));
        list3.add(new Course(00021,"微积分",92));
        list3.add(new Course(00010,"计算机组织系统",99));
        list3.add(new Course(00012,"计算机网络",100));
        student3.setList(list3);
        map.put(141250171,student3);


        Student student4 = new Student();
        student4.setId(141250209);
        student4.setName("周小帆");
        List<Course> list4 = new LinkedList<Course>();
        list4.add(new Course(00013,"离散数学",100));
        list4.add(new Course(00021,"微积分",92));
        list4.add(new Course(00010,"计算机组织系统",99));
        list4.add(new Course(00012,"计算机网络",100));
        student4.setList(list4);
        map.put(141250209,student4);

    }

    public static Map<Integer, Student> getMap() {
        return map;
    }

    public static Student indexStudent(int id){
        return map.get(id);
    }
}
