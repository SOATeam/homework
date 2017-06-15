/**
 * StudentVerifyServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl;

import service.StudentVerifyInterface;
import service.StudentVerifyService;

public class StudentVerifyServiceLocator extends org.apache.axis.client.Service implements StudentVerifyService {

    public StudentVerifyServiceLocator() {
    }


    public StudentVerifyServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public StudentVerifyServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for StudentVerifyEndpoint
    private java.lang.String StudentVerifyEndpoint_address = "http://localhost:8080/assignment10WSDL/services/StudentVerifyService";

    public java.lang.String getStudentVerifyEndpointAddress() {
        return StudentVerifyEndpoint_address;
    }

    // The WSDD wsdl name defaults to the port name.
    private java.lang.String StudentVerifyEndpointWSDDServiceName = "StudentVerifyEndpoint";

    public java.lang.String getStudentVerifyEndpointWSDDServiceName() {
        return StudentVerifyEndpointWSDDServiceName;
    }

    public void setStudentVerifyEndpointWSDDServiceName(java.lang.String name) {
        StudentVerifyEndpointWSDDServiceName = name;
    }

    public StudentVerifyInterface getStudentVerifyEndpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(StudentVerifyEndpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getStudentVerifyEndpoint(endpoint);
    }

    public StudentVerifyInterface getStudentVerifyEndpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            StudentVerifyBindingStub _stub = new StudentVerifyBindingStub(portAddress, this);
            _stub.setPortName(getStudentVerifyEndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setStudentVerifyEndpointEndpointAddress(java.lang.String address) {
        StudentVerifyEndpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this wsdl has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (StudentVerifyInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                StudentVerifyBindingStub _stub = new StudentVerifyBindingStub(new java.net.URL(StudentVerifyEndpoint_address), this);
                _stub.setPortName(getStudentVerifyEndpointWSDDServiceName());
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
     * If this wsdl has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("StudentVerifyEndpoint".equals(inputPortName)) {
            return getStudentVerifyEndpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "StudentVerifyService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "StudentVerifyEndpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("StudentVerifyEndpoint".equals(portName)) {
            setStudentVerifyEndpointEndpointAddress(address);
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
