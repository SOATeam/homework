/**
 * StudentInfoServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MyPackage;

import Fault.*;
import Schema.个人基本信息类型;
import Schema.学生类型;

public class StudentInfoServiceTestCase extends junit.framework.TestCase {
    public StudentInfoServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void testStudentInfoEndpointWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new StudentInfoServiceLocator().getStudentInfoEndpointAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new StudentInfoServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1StudentInfoEndpointAddStudent() throws Exception {
        StudentInfoManageBindingStub binding;
        try {
            binding = (StudentInfoManageBindingStub)
                          new StudentInfoServiceLocator().getStudentInfoEndpoint();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            binding.addStudent(new 学生类型());
        }
        catch (InvalidStudentFault e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test2StudentInfoEndpointDeleteStudentByStudentID() throws Exception {
        StudentInfoManageBindingStub binding;
        try {
            binding = (StudentInfoManageBindingStub)
                          new StudentInfoServiceLocator().getStudentInfoEndpoint();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            binding.deleteStudentByStudentID(new java.lang.String());
        }
        catch (InvalidStudentIDFault e1) {
            throw new junit.framework.AssertionFailedError("fault1 Exception caught: " + e1);
        }
        catch (StudentIDNotFoundFault e2) {
            throw new junit.framework.AssertionFailedError("fault2 Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test3StudentInfoEndpointGetStudentInfoByStudentID() throws Exception {
        StudentInfoManageBindingStub binding;
        try {
            binding = (StudentInfoManageBindingStub)
                          new StudentInfoServiceLocator().getStudentInfoEndpoint();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            个人基本信息类型 value = null;
            value = binding.getStudentInfoByStudentID(new java.lang.String());
        }
        catch (InvalidStudentIDFault e1) {
            throw new junit.framework.AssertionFailedError("fault1 Exception caught: " + e1);
        }
        catch (StudentIDNotFoundFault e2) {
            throw new junit.framework.AssertionFailedError("fault2 Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test4StudentInfoEndpointGetStudentInfoByStudentName() throws Exception {
        StudentInfoManageBindingStub binding;
        try {
            binding = (StudentInfoManageBindingStub)
                          new StudentInfoServiceLocator().getStudentInfoEndpoint();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            个人基本信息类型 value = null;
            value = binding.getStudentInfoByStudentName(new java.lang.String());
        }
        catch (StudentNameNotFoundFault e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test5StudentInfoEndpointModifyStudentInfo() throws Exception {
        StudentInfoManageBindingStub binding;
        try {
            binding = (StudentInfoManageBindingStub)
                          new StudentInfoServiceLocator().getStudentInfoEndpoint();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            个人基本信息类型 value = null;
            value = binding.modifyStudentInfo(new 个人基本信息类型());
        }
        catch (StudentNameNotFoundFault e1) {
            throw new junit.framework.AssertionFailedError("fault1 Exception caught: " + e1);
        }
        catch (InvalidStudentInfoFault e2) {
            throw new junit.framework.AssertionFailedError("fault2 Exception caught: " + e2);
        }
            // TBD - validate results
    }

}
