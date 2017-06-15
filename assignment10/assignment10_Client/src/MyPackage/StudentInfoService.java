/**
 * StudentInfoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MyPackage;

public interface StudentInfoService extends javax.xml.rpc.Service {
    public java.lang.String getStudentInfoEndpointAddress();

    public StudentInfoManageInterface getStudentInfoEndpoint() throws javax.xml.rpc.ServiceException;

    public StudentInfoManageInterface getStudentInfoEndpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
