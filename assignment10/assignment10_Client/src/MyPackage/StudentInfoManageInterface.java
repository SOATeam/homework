/**
 * StudentInfoManageInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MyPackage;

import Fault.*;
import Schema.个人基本信息类型;
import Schema.学生类型;

public interface StudentInfoManageInterface extends java.rmi.Remote {
    public void addStudent(学生类型 addStudentIn) throws java.rmi.RemoteException, InvalidStudentFault;
    public void deleteStudentByStudentID(java.lang.String deleteByIDIn) throws java.rmi.RemoteException, InvalidStudentIDFault, StudentIDNotFoundFault;
    public 个人基本信息类型 getStudentInfoByStudentID(java.lang.String getInfoByIdIn) throws java.rmi.RemoteException, InvalidStudentIDFault, StudentIDNotFoundFault;
    public 个人基本信息类型 getStudentInfoByStudentName(java.lang.String getInfoByNameIn) throws java.rmi.RemoteException, StudentNameNotFoundFault;
    public 个人基本信息类型 modifyStudentInfo(个人基本信息类型 modInfoIn) throws java.rmi.RemoteException, StudentNameNotFoundFault, InvalidStudentInfoFault;
}
