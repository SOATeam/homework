/**
 * StudentVerifyServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MyPackage;

import Fault.InvalidVerifyFault;

public class StudentVerifyServiceTestCase extends junit.framework.TestCase {
    public StudentVerifyServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void testStudentVerifyEndpointWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new StudentVerifyServiceLocator().getStudentVerifyEndpointAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new StudentVerifyServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1StudentVerifyEndpointVerifyStudent() throws Exception {
        StudentVerifyBindingStub binding;
        try {
            binding = (StudentVerifyBindingStub)
                          new StudentVerifyServiceLocator().getStudentVerifyEndpoint();
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
            java.lang.String value = null;
            value = binding.verifyStudent(new java.lang.String());
        }
        catch (InvalidVerifyFault e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

}
