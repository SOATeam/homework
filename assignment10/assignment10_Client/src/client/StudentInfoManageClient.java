package client;

import MyPackage.StudentInfoManageInterface;
import MyPackage.StudentInfoService;
import MyPackage.StudentInfoServiceLocator;
import Schema.学生类型;

/**
 * Created by Administrator on 2017/6/15.
 */
public class StudentInfoManageClient {
  public static void main(String[] argv) {
    try {
      StudentInfoServiceLocator locator = new StudentInfoServiceLocator();
      StudentInfoManageInterface service = locator.getStudentInfoEndpoint();
      // If authorization is required
      //((StudentInfoManageBindingStub)service).setUsername("user3");
      //((StudentInfoManageBindingStub)service).setPassword("pass3");
      // invoke business method
      service.addStudent(new 学生类型());
      service.deleteStudentByStudentID("141250171");

    } catch (javax.xml.rpc.ServiceException ex) {
      ex.printStackTrace();
    } catch (java.rmi.RemoteException ex) {
      ex.printStackTrace();
    }  
  }
}
