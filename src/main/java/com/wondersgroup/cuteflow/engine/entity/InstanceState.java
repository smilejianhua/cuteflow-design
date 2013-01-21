package com.wondersgroup.cuteflow.engine.entity;

public interface InstanceState {
	
    /**
     * 初始化状态
     */
    public static final int INITIALIZED = 0;

    /**
     * 运行状态
     */
    public static final int RUNNING = 1;

    /**
     * 被挂起
     */
    public static final int SUSPENDED = 3;

    /**
     * 已经结束
     */
    public static final int COMPLETED = 7;

    /**
     * 被撤销
     */
    public static final int CANCELED = 9;
}
