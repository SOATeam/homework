package service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.mail.Session;
import javax.mail.Store;
import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.Endpoint;
import javax.xml.ws.soap.SOAPFaultException;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static service.MailLoginPort.*;


/**
 * Created by zhouxiaofan on 2017/6/14.
 */
@WebService(
        name = "MailLogin",
        endpointInterface = "service.MailLoginPort"
)
public class MailLogin {

    public String login(String mail, String psw) {
        if(!validateMailAddr(mail)){
            try {
                SOAPFactory fac = SOAPFactory.newInstance();
                SOAPFault sf = fac.createFault("input exception",
                        new QName("http://schemas.xmlsoap.org/soap/envelope/", "Client"));
                Detail d = sf.addDetail();
                DetailEntry de = d.addDetailEntry(
                        new QName("", "invalidCC"));
                de.setValue("mail address is invalid");
                throw new SOAPFaultException(sf);
            } catch (SOAPException e) {
                throw new RuntimeException(
                        "Failed to create SOAPFault: " + e.getMessage());
            }
        }
        boolean success = authenticate(mail, psw);
        String result;
        if(success) {
            result = checkIdentity(mail);
        } else {
            result = FAIL;
        }
        System.out.print("you identity is " + result);
        return result;
    }

    private boolean validateMailAddr(String mail) {
        String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        Pattern regex = Pattern.compile(check);
        Matcher matcher = regex.matcher(mail);
        boolean isMatched = matcher.matches();
        return isMatched;
    }

    @WebMethod(exclude=true)
    public boolean authenticate(String mail, String password) {
        boolean isConnection = true;

        Properties props = new Properties();
        props.setProperty("mail.debug", "true");
        props.setProperty("mail.store.protocol", "imap");
        props.setProperty("mail.imap.host", "imap.exmail.qq.com");

        Session session = Session.getInstance(props);
        session.setDebug(true);

        Store store = null;
        try {
            store = session.getStore();
            store.connect(mail, password);
            isConnection = store.isConnected();
        } catch (javax.mail.MessagingException e) {
            e.printStackTrace();
        } finally {
            try {
                store.close();
            } catch (javax.mail.MessagingException e) {
                e.printStackTrace();
            }
        }
        return isConnection;
    }
    private String checkIdentity(String mail) {
        String[] strArr = mail.split("@");
        if (strArr.length < 2) {
            return UNKNOWN;
        } else {
            String prefix = strArr[0];
            String postfix = strArr[1];
            if (postfix.equals("smail.nju.edu.cn")) {
                if (prefix.startsWith("MF") || prefix.startsWith("MG")) {
                    return GRA_STUDENT;
                } else if (isNum(prefix)) {
                    return STUDENT;
                }
            } else if (postfix.equals("nju.edu.cn")) {
                return TEACHER;
            }
        }
        return UNKNOWN;
    }

    private boolean isNum(String str) {
        for(int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        // String address = "http://172.17.135.165:8080/mailLogin";
        // 部署到本地，只有本机访问
        String address = "http://localhost:8080/mailLogin";
        Endpoint.publish(address, new MailLogin());
        System.out.println("Publish Success!");
        System.out.println("Address:" + address);
    }

}
