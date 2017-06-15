package client;

import MyPackage.ScoreInterface;
import MyPackage.ScoreServiceLocator;
import Schema.删除成绩类型;
import Schema.添加或修改成绩类型;

/**
 * Created by Administrator on 2017/6/15.
 */
public class ScoreClient {
  public static void main(String[] argv) {
    try {
      ScoreServiceLocator locator = new ScoreServiceLocator();

      ScoreInterface service = locator.getScorePort();
      // If authorization is required
      //((ScoreSoapBindingStub)service).setUsername("user3");
      //((ScoreSoapBindingStub)service).setPassword("pass3");
      // invoke business method
      service.addScore(new 添加或修改成绩类型());
      service.deleteScore(new 删除成绩类型());
      service.modifyScore(new 添加或修改成绩类型());

      service.searchScore("141250176");

    } catch (javax.xml.rpc.ServiceException ex) {
      ex.printStackTrace();
    } catch (java.rmi.RemoteException ex) {
      ex.printStackTrace();
    }
  }
}
