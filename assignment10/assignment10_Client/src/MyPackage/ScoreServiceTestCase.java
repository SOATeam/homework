/**
 * ScoreServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MyPackage;

import Fault.AddScoreFault;
import Fault.DeleteScoreFault;
import Fault.ModifyScoreFault;
import Fault.SearchScoreFault;
import Schema.删除成绩类型;
import Schema.单项成绩类型;
import Schema.添加或修改成绩类型;

public class ScoreServiceTestCase extends junit.framework.TestCase {
    public ScoreServiceTestCase(java.lang.String name) {
        super(name);
    }


    public void testScorePortWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new ScoreServiceLocator().getScorePortAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new ScoreServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1ScorePortSearchScore() throws Exception {
        ScoreSoapBindingStub binding;
        try {
            binding = (ScoreSoapBindingStub)
                          new ScoreServiceLocator().getScorePort();
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
            单项成绩类型[] value = null;
            value = binding.searchScore(new java.lang.String());
        }
        catch (SearchScoreFault e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test2ScorePortAddScore() throws Exception {
        ScoreSoapBindingStub binding;
        try {
            binding = (ScoreSoapBindingStub)
                          new ScoreServiceLocator().getScorePort();
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
            value = binding.addScore(new 添加或修改成绩类型());
        }
        catch (AddScoreFault e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test3ScorePortDeleteScore() throws Exception {
        ScoreSoapBindingStub binding;
        try {
            binding = (ScoreSoapBindingStub)
                          new ScoreServiceLocator().getScorePort();
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
            value = binding.deleteScore(new 删除成绩类型());
        }
        catch (DeleteScoreFault e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test4ScorePortModifyScore() throws Exception {
        ScoreSoapBindingStub binding;
        try {
            binding = (ScoreSoapBindingStub)
                          new ScoreServiceLocator().getScorePort();
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
            value = binding.modifyScore(new 添加或修改成绩类型());
        }
        catch (ModifyScoreFault e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

}
