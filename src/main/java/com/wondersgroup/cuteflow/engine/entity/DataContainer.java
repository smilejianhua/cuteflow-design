package com.wondersgroup.cuteflow.engine.entity;

import java.util.HashMap;

public class DataContainer {
	
	private HashMap<String,String> data = new HashMap<String,String>();
	
	public void setData(String key, String value){
		data.put(key,value);
	}
}
