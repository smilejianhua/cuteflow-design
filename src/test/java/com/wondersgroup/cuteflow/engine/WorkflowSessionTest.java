package com.wondersgroup.cuteflow.engine;

import org.junit.Before;
import org.junit.Test;

import com.wondersgroup.cuteflow.engine.entity.ActivityInstance;
import com.wondersgroup.cuteflow.engine.entity.ProcessInstance;
import com.wondersgroup.cuteflow.engine.entity.ProcessModel;

public class WorkflowSessionTest extends AbstractWorkflowTestCase {
	
	private RuntimeContext runtimeContext;
	String modelXML;
	
	@Before
	public void init(){
//		runtimeContext = (RuntimeContext)applicationContext.getBean("runtimeContext");
//		modelXML = "";
	}
	
	@Test
	public void testProcessModelDeploy(){
		WorkflowSession workflowSession = runtimeContext.getWorkflowSession();
		ProcessModel model = ProcessModel.parser(modelXML);
		workflowSession.deployProcessModel(model);
	}
	
	@Test
	public void testProcessInstanceCreate(){
		WorkflowSession workflowSession = runtimeContext.getWorkflowSession();
		String processModelName = "testNewEngine";
		ProcessInstance pi = workflowSession.createProcessInstance(processModelName);
	}
	
	@Test
	public void testActivityInstanceCreate(){
		WorkflowSession workflowSession = runtimeContext.getWorkflowSession();
		long activityInstanceId = 2;
		ActivityInstance ai = workflowSession.loadActivityInstance(activityInstanceId);
	}
}
