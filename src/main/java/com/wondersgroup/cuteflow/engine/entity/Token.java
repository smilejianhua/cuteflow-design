package com.wondersgroup.cuteflow.engine.entity;

public class Token {
	
	private ActivityInstance ai;
	// 记录Activity的步数
	private int STEP_NUMBER = 0; 
	
	public void signal(){		
		STEP_NUMBER = STEP_NUMBER + 1;
	}
	
	public ActivityInstance getActivityInstance(){
		return ai;
	}
	
	public void setActivityInstance(ActivityInstance ai){
		this.ai = ai;
	}
}
