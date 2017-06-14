package example;

import mypackage.MailLoginPort_PortType;
import mypackage.MailLoginServiceLocator;
import org.apache.log4j.BasicConfigurator;


/**
 * Created by zhouxiaofan on 2017/6/14.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
    BasicConfigurator.configure();
    try {
      MailLoginServiceLocator locator = new MailLoginServiceLocator();
      MailLoginPort_PortType service = locator.getMailLoginPort();
      // If authorization is required
      //((MailLoginPortBindingStub)service).setUsername("user3");
      //((MailLoginPortBindingStub)service).setPassword("pass3");
      // invoke business method
      String result = service.login("141250209@smail.nju.edu.cn","zxf14125");
      System.out.println(result);
    } catch (javax.xml.rpc.ServiceException ex) {
      ex.printStackTrace();
    } catch (java.rmi.RemoteException ex) {
      ex.printStackTrace();
    }
  }
}
