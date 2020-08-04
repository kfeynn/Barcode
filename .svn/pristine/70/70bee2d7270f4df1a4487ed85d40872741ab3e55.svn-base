package com.barcode.core.session;

import java.io.Serializable;
import java.util.Collection;

import org.apache.shiro.session.Session;

import com.barcode.common.utils.LoggerUtils;
import com.barcode.core.cache.ISessionRepository;
import com.barcode.core.dao.CustomSessionDao;

/**
 * session管理器
 * @author jiaquan.chen
 *
 */
public class CustomSessionManager {

	public static final String SESSION_STATUS = "*session_online_status";
	
	private ISessionRepository sessionRepository;
	
	private CustomSessionDao customSessionDao;
	
	public void saveSession(Session session){
		sessionRepository.saveSession(session);
	}
	
	public Session getSession(Serializable sessionId){
		return sessionRepository.getSession(sessionId);
	}
	
	public Collection<Session> getAllSession(){
		return sessionRepository.getAllSession();
	}
	
	public void deleteSession(Serializable sessionId){
		sessionRepository.deleteSession(sessionId);
	}
	
	public void changeSessionStatus(boolean status, Serializable sessionId){
		try{
			Session session = sessionRepository.getSession(sessionId);
			SessionStatus sessionStatus = new SessionStatus();
			sessionStatus.setOnlineStatus(status);
			session.setAttribute(SESSION_STATUS, sessionStatus);
			customSessionDao.update(session);
		}catch(Exception e){
			LoggerUtils.fmtError(getClass(), e, "改变Session状态错误 sessionId : " + sessionId);
		}		
	}

	public void setSessionRepository(ISessionRepository sessionRepository) {
		this.sessionRepository = sessionRepository;
	}

	public void setCustomSessionDao(CustomSessionDao customSessionDao) {
		this.customSessionDao = customSessionDao;
	}
	
}
