package com.wondersgroup.cuteflow.engine;

import org.junit.Before;
import org.junit.Test;

import com.wondersgroup.cuteflow.engine.entity.ProcessInstance;
import com.wondersgroup.cuteflow.engine.entity.Token;

public class TokenTest extends AbstractWorkflowTestCase {
	
	private RuntimeContext runtimeContext;
	
	@Before
	public void init(){
		runtimeContext = (RuntimeContext)applicationContext.getBean("runtimeContext");
	}
	
	@Test
	public void testTokenSignal(){
		ProcessInstance pi = runtimeContext.getWorkflowSession().createProcessInstance("test");
		pi.getDataContainer().setData("param", "1000");
		Token token = pi.getRootToken();
		token.signal();
		assertEquals("state_one",token.getActivityInstance().getName());
	}
}
