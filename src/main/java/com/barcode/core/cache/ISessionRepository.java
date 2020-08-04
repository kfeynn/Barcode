package com.barcode.core.cache;

import java.io.Serializable;
import java.util.Collection;

import org.apache.shiro.session.Session;

public interface ISessionRepository {

	void saveSession(Session session);
	
	Session getSession(Serializable sessionId);
	
	Collection<Session> getAllSession();
	
	void deleteSession(Serializable sessionId);
}
