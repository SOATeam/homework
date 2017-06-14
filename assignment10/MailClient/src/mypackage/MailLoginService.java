/**
 * MailLoginService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public interface MailLoginService extends javax.xml.rpc.Service {
    public java.lang.String getMailLoginPortAddress();

    public mypackage.MailLoginPort_PortType getMailLoginPort() throws javax.xml.rpc.ServiceException;

    public mypackage.MailLoginPort_PortType getMailLoginPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
