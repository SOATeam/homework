/**
 * MailLoginServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class MailLoginServiceLocator extends org.apache.axis.client.Service implements mypackage.MailLoginService {

    public MailLoginServiceLocator() {
    }


    public MailLoginServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MailLoginServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MailLoginPort
    private java.lang.String MailLoginPort_address = "http://localhost:8080/mailLogin";

    public java.lang.String getMailLoginPortAddress() {
        return MailLoginPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MailLoginPortWSDDServiceName = "MailLoginPort";

    public java.lang.String getMailLoginPortWSDDServiceName() {
        return MailLoginPortWSDDServiceName;
    }

    public void setMailLoginPortWSDDServiceName(java.lang.String name) {
        MailLoginPortWSDDServiceName = name;
    }

    public mypackage.MailLoginPort_PortType getMailLoginPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MailLoginPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMailLoginPort(endpoint);
    }

    public mypackage.MailLoginPort_PortType getMailLoginPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.MailLoginPortBindingStub _stub = new mypackage.MailLoginPortBindingStub(portAddress, this);
            _stub.setPortName(getMailLoginPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMailLoginPortEndpointAddress(java.lang.String address) {
        MailLoginPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.MailLoginPort_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.MailLoginPortBindingStub _stub = new mypackage.MailLoginPortBindingStub(new java.net.URL(MailLoginPort_address), this);
                _stub.setPortName(getMailLoginPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("MailLoginPort".equals(inputPortName)) {
            return getMailLoginPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service/", "MailLoginService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service/", "MailLoginPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MailLoginPort".equals(portName)) {
            setMailLoginPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
