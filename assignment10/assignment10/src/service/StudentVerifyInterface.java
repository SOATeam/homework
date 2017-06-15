/**
 * StudentVerifyInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

import fault.InvalidVerifyFault;

public interface StudentVerifyInterface extends java.rmi.Remote {
    public java.lang.String verifyStudent(java.lang.String fault) throws java.rmi.RemoteException, InvalidVerifyFault;
}
