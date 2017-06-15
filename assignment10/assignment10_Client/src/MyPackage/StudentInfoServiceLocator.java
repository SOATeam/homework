/**
 * StudentInfoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MyPackage;

public class StudentInfoServiceLocator extends org.apache.axis.client.Service implements StudentInfoService {

    public StudentInfoServiceLocator() {
    }


    public StudentInfoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public StudentInfoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for StudentInfoEndpoint
    private java.lang.String StudentInfoEndpoint_address = "http://localhost:8080/assignment8Service/service/StudentInfo";

    public java.lang.String getStudentInfoEndpointAddress() {
        return StudentInfoEndpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String StudentInfoEndpointWSDDServiceName = "StudentInfoEndpoint";

    public java.lang.String getStudentInfoEndpointWSDDServiceName() {
        return StudentInfoEndpointWSDDServiceName;
    }

    public void setStudentInfoEndpointWSDDServiceName(java.lang.String name) {
        StudentInfoEndpointWSDDServiceName = name;
    }

    public StudentInfoManageInterface getStudentInfoEndpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(StudentInfoEndpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getStudentInfoEndpoint(endpoint);
    }

    public StudentInfoManageInterface getStudentInfoEndpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            StudentInfoManageBindingStub _stub = new StudentInfoManageBindingStub(portAddress, this);
            _stub.setPortName(getStudentInfoEndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setStudentInfoEndpointEndpointAddress(java.lang.String address) {
        StudentInfoEndpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (StudentInfoManageInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                StudentInfoManageBindingStub _stub = new StudentInfoManageBindingStub(new java.net.URL(StudentInfoEndpoint_address), this);
                _stub.setPortName(getStudentInfoEndpointWSDDServiceName());
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
        if ("StudentInfoEndpoint".equals(inputPortName)) {
            return getStudentInfoEndpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "StudentInfoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "StudentInfoEndpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("StudentInfoEndpoint".equals(portName)) {
            setStudentInfoEndpointEndpointAddress(address);
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
