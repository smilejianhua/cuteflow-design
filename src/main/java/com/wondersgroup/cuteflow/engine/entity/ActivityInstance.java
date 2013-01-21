package com.wondersgroup.cuteflow.engine.entity;

import java.util.Date;

import com.wondersgroup.cuteflow.engine.exception.EngineException;

/**
 * 任务实例<br>
 * 对任务实例的状态字段作如下规定：小于5的状态为“活动”状态，大于等于5的状态为“非活动”状态。<br>
 * 活动状态包括：INITIALIZED,RUNNING,SUSPENDED<br>
 * 非活动状态包括：COMPLETED,CANCELED
 */

public interface ActivityInstance extends InstanceState {
	
	/**
	 * 返回任务实例的Id
	 * 
	 * @return
	 */
	public String getId();

	/**
	 * 返回对应的任务Id
	 * 
	 * @return
	 */
	public String getTaskId();

	/**
	 * 返回任务Name
	 * 
	 * @return
	 */
	public String getName();

	/**
	 * 返回任务显示名
	 * 
	 * @return
	 */
	public String getDisplayName();

	/**
	 * 返回对应的流程实例Id
	 * 
	 * @return
	 */
	public String getProcessInstanceId();

	/**
	 * 返回对应的流程的Id
	 * 
	 * @return
	 */
	public String getProcessId();

	/**
	 * 返回流程的版本
	 * 
	 * @return
	 */
	public Integer getVersion();

	/**
	 * 返回任务实例创建的时间
	 * 
	 * @return
	 */
	public Date getCreatedTime();

	/**
	 * 返回任务实例启动的时间
	 * 
	 * @return
	 */
	public Date getStartedTime();

	/**
	 * 返回任务实例结束的时间
	 * 
	 * @return
	 */
	public Date getEndTime();

	/**
	 * 返回任务实例到期日期
	 * 
	 * @return
	 */
	public Date getExpiredTime();// 过期时间

	/**
	 * 返回任务实例的状态，取值为：INITIALIZED(已初始化），STARTED(已启动),COMPLETED(已结束),CANCELD(被取消)
	 * 
	 * @return
	 */
	public Integer getState();

	/**
	 * 返回任务实例的分配策略，取值为 org.fireflow.model.Task.ALL或者org.fireflow.model.Task.ANY
	 * 
	 * @return
	 */
	public String getAssignmentStrategy();

	/**
	 * 返回任务实例所属的环节的Id
	 * 
	 * @return
	 */
	public String getActivityId();

	/**
	 * 返回任务类型，取值为org.fireflow.model.Task.FORM,org.fireflow.model.Task.TOOL,
	 * org.fireflow.model.Task.SUBFLOW或者org.fireflow.model.Task.DUMMY
	 * 
	 * @return
	 */
	public String getTaskType();

	/**
	 * 取消该任务（保留，未实现） 这个方法暂时取消，因为abort无清晰的无二义性的业务含义。
	 * 
	 * @throws org.fireflow.engine.EngineException
	 * @throws org.fireflow.kenel.KenelException
	 */
	public void abort() throws EngineException;
}
