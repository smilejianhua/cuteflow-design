package com.wondersgroup.cuteflow.engine.service;

import java.util.List;

import com.wondersgroup.cuteflow.engine.entity.Task;

public interface WorkItemService {
	
    /**
     * 插入或者更新WorkItem
     */
    public void saveOrUpdateWorkItem(Task workitem);

    /**
     * 返回任务实例的所有"活的"WorkItem的数量。
     * "活的"WorkItem 是指状态等于INITIALIZED、STARTED或者SUSPENDED的WorkItem。
     */
    public Integer getAliveWorkItemCountForTaskInstance(String taskInstanceId);

    /**
     * 查询任务实例的所有"已经结束"WorkItem。<br>
     * 所以必须有关联条件WorkItem.state=WorkItem.COMPLETED 
     */
    public List<Task> findCompletedWorkItemForTaskInstance(String taskInstanceId);

    /**
     * 查询某任务实例的所有WorkItem
     */
    public List<Task> findWorkItemForTaskInstance(String taskInstanceId);
    
    
    /**
     * 删除处于初始化状态的workitem，此方法用于签收Workitem时，删除其他Actor的WorkItem。
     */
    public void deleteWorkItemsInInitializedState(String taskInstanceId);

    
    /**
     * Find workItem by id
     */
    public Task findWorkItemById(String id);
    
    
    /**
     * Find all workitems for task
     */
    public List<Task> findWorkItemsForTask(String taskid);    
    

    /**
     * 根据操作员的Id返回其待办工单。如果actorId==null，则返回系统所有的待办任务
     * 待办工单是指状态等于INITIALIZED或STARTED工单
     */
    public List<Task> findTodoWorkItems(String actorId);
    
    /**
     * 查找操作员在某个流程实例中的待办工单。
     * 
     * 如果processInstanceId为空，则等价于调用findTodoWorkItems(String actorId)
     * 待办工单是指状态等于INITIALIZED或STARTED工单<br/>
     */
    public List<Task> findTodoWorkItems(String actorId,String processInstanceId);
    
    /**
     * 查找操作员在某个流程某个任务上的待办工单。
     * 
     * actorId，processId，taskId都可以为空（null或者""）,为空的条件将被忽略
     * 待办工单是指状态等于INITIALIZED或STARTED工单<br/>
     */
    public List<Task> findTodoWorkItems(String actorId,String processId,String taskId);
    
    /**
     * 根据操作员的Id返回其已办工单。如果actorId==null，则返回系统所有的已办任务
     * 已办工单是指状态等于COMPLETED或CANCELED的工单<br/>
     */
    public List<Task> findHaveDoneWorkItems(String actorId);
    
    /**
     * 查找操作员在某个流程实例中的已办工单。
     * 如果processInstanceId为空，则等价于调用findHaveDoneWorkItems(String actorId)
     * 已办工单是指状态等于COMPLETED或CANCELED的工单<br/>
     */
    public List<Task> findHaveDoneWorkItems(String actorId,String processInstanceId);
    
    /**
     * 查找操作员在某个流程某个任务上的已办工单。
     * actorId，processId，taskId都可以为空（null或者""）,为空的条件将被忽略
     * 已办工单是指状态等于COMPLETED或CANCELED的工单<br/>
     */
    public List<Task> findHaveDoneWorkItems(String actorId,String processId,String taskId);
}
