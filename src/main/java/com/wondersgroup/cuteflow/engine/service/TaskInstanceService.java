package com.wondersgroup.cuteflow.engine.service;

import java.util.List;

import com.wondersgroup.cuteflow.engine.entity.ActivityInstance;

public interface TaskInstanceService {
	
	 /**
     * 插入或者更新TaskInstance。
     * 
     * @param taskInstance
     */
    public void saveOrUpdateTaskInstance(ActivityInstance taskInstance);

    /**
     * 终止TaskInstance。将任务实例及其所有的“活的”WorkItem变成Canceled状态。<br/>
     * "活的"WorkItem 是指状态等于INITIALIZED、STARTED或者SUSPENDED的WorkItem.
     * @param taskInstanceId
     */
    public void abortTaskInstance(ActivityInstance taskInstance);
    
    /**
     * 返回“活的”TaskInstance。<br/>
     * “活的”是指TaskInstance.state=INITIALIZED Or TaskInstance.state=STARTED 。
     * @param id
     * @return
     */
    public ActivityInstance findAliveTaskInstanceById(String id);

    /**
     * 获得activity的“活的”TaskInstance的数量<br/>
     * “活的”是指TaskInstance.state=INITIALIZED Or TaskInstance.state=STARTED 。
     * @param processInstanceId
     * @param activityId
     * @return
     */
    public Integer getAliveTaskInstanceCountForActivity(String processInstanceId, String activityId);

    /**
     * 返回某个Task已经结束的TaskInstance的数量。<br/>
     * “已经结束”是指TaskInstance.state=COMPLETED。
     * @param processInstanceId
     * @param taskId
     * @return
     */
    public Integer getCompletedTaskInstanceCountForTask(String processInstanceId,String taskId);


    /**
     * Find the task instance by id
     */
    public ActivityInstance findTaskInstanceById(String id);
    
    /**
     * 查询流程实例的所有的TaskInstance,如果activityId不为空，则返回该流程实例下指定环节的TaskInstance
     */
    public List<ActivityInstance> findTaskInstancesForProcessInstance(String processInstanceId, String activityId);


    /**
     * 查询出同一个stepNumber的所有TaskInstance实例
     */
    public List<ActivityInstance> findTaskInstancesForProcessInstanceByStepNumber(String processInstanceId,Integer stepNumber);
    
    
    /**
     * 调用数据库自身的机制所定TaskInstance实例。<br/>
     * 该方法主要用于工单的签收操作，在签收之前先锁定与之对应的TaskInstance。
     * @param taskInstanceId
     * @return
     */
    public void lockTaskInstance(String taskInstanceId);
}
