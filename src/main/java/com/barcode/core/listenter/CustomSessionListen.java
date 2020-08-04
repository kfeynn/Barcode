package com.barcode.core.listenter;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionListener;

public class CustomSessionListen implements SessionListener {

	public void onExpiration(Session session) {
		//从缓存中删除session
		System.out.println("会话过期：" + session.getId());
	}

	public void onStart(Session session) {
		System.out.println("会话创建：" + session.getId());
	}

	public void onStop(Session session) {
		System.out.println("退出会话：" + session.getId());
	}

}
