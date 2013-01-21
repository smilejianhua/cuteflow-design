package com.wondersgroup.cuteflow.engine.service;

import java.util.List;

import com.wondersgroup.cuteflow.engine.entity.ProcessInstance;

public interface ProcessInstanceService {
	
    /**
     * 插入或者更新ProcessInstance 。<br/>
     * 
     * @param processInstance
     */
    public void saveOrUpdateProcessInstance(ProcessInstance processInstance);
    
    /**
     * 通过ID获得Alive ProcessInstance对象。<br>
     * 
     * @param id processInstance.id
     * @return process instance
     */
    public ProcessInstance findAliveProcessInstanceById(String id);
    
    /**
     * 通过ID获得ProcessInstance对象。
     * 
     * @param id processInstance.id
     * @return process instance
     */
    public ProcessInstance findProcessInstanceById(String id);
    

    /**
     * 查找并返回同一个业务流程的所有实例
     * 
     * @param processId The id of the process definition.
     * @return A list of processInstance
     */
    public List<ProcessInstance> findProcessInstancesByProcessId(String processId);
    
    /**
     * 终止流程实例。
     * 将流程实例、活动的TaskInstance、活动的WorkItem的状态设置为CANCELED；并删除所有的token。
     * 
     * @param processInstanceId
     */
    public void abortProcessInstance(ProcessInstance processInstance);
    
    /**
     * 挂起流程实例
     * @param processInstance
     */
    public void suspendProcessInstance(ProcessInstance processInstance);

    /**
     * 恢复流程实例
     * @param processInstance
     */
    public void restoreProcessInstance(ProcessInstance processInstance);
}
