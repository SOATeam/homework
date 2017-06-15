/**
 * ScoreServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MyPackage;

public class ScoreServiceLocator extends org.apache.axis.client.Service implements ScoreService {

    public ScoreServiceLocator() {
    }


    public ScoreServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ScoreServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ScorePort
    private java.lang.String ScorePort_address = "http://localhost:8080/assignment10WSDL/services/ScoreService";

    public java.lang.String getScorePortAddress() {
        return ScorePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ScorePortWSDDServiceName = "ScorePort";

    public java.lang.String getScorePortWSDDServiceName() {
        return ScorePortWSDDServiceName;
    }

    public void setScorePortWSDDServiceName(java.lang.String name) {
        ScorePortWSDDServiceName = name;
    }

    public ScoreInterface getScorePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ScorePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getScorePort(endpoint);
    }

    public ScoreInterface getScorePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ScoreSoapBindingStub _stub = new ScoreSoapBindingStub(portAddress, this);
            _stub.setPortName(getScorePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setScorePortEndpointAddress(java.lang.String address) {
        ScorePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ScoreInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                ScoreSoapBindingStub _stub = new ScoreSoapBindingStub(new java.net.URL(ScorePort_address), this);
                _stub.setPortName(getScorePortWSDDServiceName());
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
        if ("ScorePort".equals(inputPortName)) {
            return getScorePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "ScoreService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "ScorePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ScorePort".equals(portName)) {
            setScorePortEndpointAddress(address);
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
