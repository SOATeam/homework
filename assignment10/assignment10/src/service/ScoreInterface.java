/**
 * ScoreInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

import fault.AddScoreFault;
import fault.DeleteScoreFault;
import fault.ModifyScoreFault;
import fault.SearchScoreFault;
import schema.删除成绩类型;
import schema.单项成绩类型;
import schema.添加或修改成绩类型;

public interface ScoreInterface extends java.rmi.Remote {
    public 单项成绩类型[] searchScore(java.lang.String studentNo) throws java.rmi.RemoteException, SearchScoreFault;
    public java.lang.String addScore(添加或修改成绩类型 addScore) throws java.rmi.RemoteException, AddScoreFault;
    public java.lang.String deleteScore(删除成绩类型 delScore) throws java.rmi.RemoteException, DeleteScoreFault;
    public java.lang.String modifyScore(添加或修改成绩类型 modSocre) throws java.rmi.RemoteException, ModifyScoreFault;
}
