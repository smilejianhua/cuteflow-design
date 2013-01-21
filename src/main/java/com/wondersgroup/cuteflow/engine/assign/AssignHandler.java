package com.wondersgroup.cuteflow.engine.assign;

import java.util.List;

import com.wondersgroup.cuteflow.engine.entity.Task;

public interface AssignHandler {
	
	public void assgin(List<WorkflowUser> users, Task workItem);
}
