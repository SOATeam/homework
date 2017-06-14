package service;

import javax.jws.WebService;

/**
 * Created by zhouxiaofan on 2017/6/14.
 */
@WebService(name = "MailLoginPort")
public interface MailLoginPort {
    public static final String TEACHER = "Teacher";
    public static final String STUDENT = "Student";
    public static final String GRA_STUDENT = "Graduate Student";
    public static final String UNKNOWN = "Unknown";
    public static final String FAIL = "Fail";

    public String login(String mail, String password);
}
