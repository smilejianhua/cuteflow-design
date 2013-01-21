package com.wondersgroup.cuteflow.engine;

import com.wondersgroup.cuteflow.engine.entity.ActivityInstance;
import com.wondersgroup.cuteflow.engine.entity.ProcessInstance;
import com.wondersgroup.cuteflow.engine.entity.ProcessModel;

public interface WorkflowSession {
	
	public void deployProcessModel(ProcessModel model);
	
	public ProcessInstance createProcessInstance(String processModelName);
	
	public ActivityInstance loadActivityInstance(long activityInstanceId);
}
