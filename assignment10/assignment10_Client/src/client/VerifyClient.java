package client;

import MyPackage.StudentVerifyInterface;
import MyPackage.StudentVerifyServiceLocator;

/**
 * Created by Administrator on 2017/6/15.
 */
public class VerifyClient {
  public static void main(String[] argv) {
    try {
      StudentVerifyServiceLocator locator = new StudentVerifyServiceLocator();
      StudentVerifyInterface service = locator.getStudentVerifyEndpoint();
      // If authorization is required
      //((StudentVerifyBindingStub)service).setUsername("user3");
      //((StudentVerifyBindingStub)service).setPassword("pass3");
      // invoke business method
      service.verifyStudent("141250176");
    } catch (javax.xml.rpc.ServiceException ex) {
      ex.printStackTrace();
    } catch (java.rmi.RemoteException ex) {
      ex.printStackTrace();
    }
  }
}
