package com.wondersgroup.cuteflow.engine.entity;

public class ProcessInstance implements InstanceState {
	
	public DataContainer getDataContainer(){
		return null;
	}
	
	public Token getRootToken(){
		return new Token();
	}
}