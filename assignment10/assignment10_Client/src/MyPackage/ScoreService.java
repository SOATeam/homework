/**
 * ScoreService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MyPackage;

public interface ScoreService extends javax.xml.rpc.Service {
    public java.lang.String getScorePortAddress();

    public ScoreInterface getScorePort() throws javax.xml.rpc.ServiceException;

    public ScoreInterface getScorePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
