package com.barcode.core.cache.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import org.apache.shiro.session.Session;

import com.barcode.common.utils.LoggerUtils;
import com.barcode.common.utils.SerializeUtil;
import com.barcode.core.cache.CacheManager;
import com.barcode.core.cache.ISessionRepository;
import com.barcode.core.session.CustomSessionManager;
import com.barcode.core.session.SessionStatus;


public class SessionRepositoryImpl implements ISessionRepository {
	
	
	//需配置自动扫描，这里就不配置了，setter注入
	CacheManager<Serializable, Session> cacheManager;
	
	public void saveSession(Session session) {
		//Set<Serializable> keys = cacheManager.keys();
		//Session v = cacheManager.get(session.getId());
		//Collection<Session> sessions = cacheManager.getAllSession();
		if(null == session || session.getId() == null)
			throw new NullPointerException("session is empty!");

		try{
			//byte[] key = SerializeUtil.serialize(session.getId());
			
			//判断session是新建的还是从仓库中取的
			if(null == session.getAttribute(CustomSessionManager.SESSION_STATUS)){
				//保存在线状态
				SessionStatus sessionStatus = new SessionStatus();
				session.setAttribute(CustomSessionManager.SESSION_STATUS, sessionStatus);
			}
			
			//byte[] value = SerializeUtil.serialize(session);
			getCacheManager().put(session.getId(), session);
		}catch(Exception e){
			
		}
	}

	public Session getSession(Serializable sessionId) {
		
		if(null == sessionId)
			throw new NullPointerException("sessionId is empty!");
		
		Session value = getCacheManager().get(sessionId);
		
		return value;
	}
	
	public Collection<Session> getAllSession(){
		return getCacheManager().getAllSession();
	}

	public void deleteSession(Serializable sessionId) {
		if(null == sessionId)
			throw new NullPointerException("sessionId is empty!");
		
		byte[] key = SerializeUtil.serialize(sessionId);
		
		if(!getCacheManager().keys().contains(key)){
			LoggerUtils.debug(getClass(), "缓存没有对应的的key:" + sessionId);
			return;
		}
		
		getCacheManager().remove(key);
	}

	public CacheManager<Serializable, Session> getCacheManager() {
		return cacheManager;
	}

	public void setCacheManager(CacheManager<Serializable, Session> cacheManager) {
		this.cacheManager = cacheManager;
	}

	

	
	
}
