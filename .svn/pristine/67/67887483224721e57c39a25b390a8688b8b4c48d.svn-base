package com.barcode.core.dao;

import java.io.Serializable;
import java.util.Collection;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.UnknownSessionException;
import org.apache.shiro.session.mgt.eis.AbstractSessionDAO;

import com.barcode.common.utils.LoggerUtils;
import com.barcode.core.session.CustomSessionManager;

public class CustomSessionDao extends AbstractSessionDAO {
	
	CustomSessionManager customSessionManager;

	public void setCustomSessionManager(CustomSessionManager customSessionManager) {
		this.customSessionManager = customSessionManager;
	}

	//删除会话；当会话过期/会话停止（如用户退出时）会调用
	public void delete(Session session) {
		if(null == session){
			LoggerUtils.error(getClass(), "Session 不能为null");
			return;
		}
		if(null != session.getId())
			customSessionManager.deleteSession(session.getId());
	}

	//获取当前所有活跃用户，如果用户量多此方法影响性能
	public Collection<Session> getActiveSessions() {
		return customSessionManager.getAllSession();
	}

	//更新会话；如更新会话最后访问时间/停止会话/设置超时时间/设置移除属性等会调用
	public void update(Session session) throws UnknownSessionException {
		customSessionManager.saveSession(session);
	}

	//创建会话
	@Override
	protected Serializable doCreate(Session session) {
		Serializable sessionId = this.generateSessionId(session);
		this.assignSessionId(session, sessionId);
		customSessionManager.saveSession(session);
		return sessionId;
	}

	//根据会话ID获取会话
	@Override
	protected Session doReadSession(Serializable sessionId) {
		return customSessionManager.getSession(sessionId);
	}

}
