package com.wondersgroup.cuteflow.engine.service;

import java.util.List;

import com.wondersgroup.cuteflow.engine.entity.Token;

public interface TokenService {
	
    /**
     * Save token
     */
    public void saveOrUpdateToken(Token token);

    /**
     * 统计流程任意节点的活动Token的数量。对于Activity节点，该数量只能取值1或者0，大于1表明有流程实例出现异常。
     */
    public Integer getAliveTokenCountForNode(String processInstanceId, String nodeId);

    /**
     * (Engine没有引用到该方法，提供给业务系统使用，20090303)
     */
    public Token findTokenById(String id);

    /**
     * Find all the tokens for process instance ,and the nodeId of the token must equals to the second argument.
     */
    public List<Token> findTokensForProcessInstance(String processInstanceId, String nodeId);

    /**
     * 删除某个节点的所有token
     */
    public void deleteTokensForNode(String processInstanceId,String nodeId);

    /**
     * 删除某些节点的所有token
     */
    public void deleteTokensForNodes(String processInstanceId,List<Integer> nodeIdsList);

    /**
     * 删除token
     */
    public void deleteToken(Token token);
}
