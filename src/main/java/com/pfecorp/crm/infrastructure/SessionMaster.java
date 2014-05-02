/**
 * Copyright - Property of PFE Corportation
 */
package com.pfecorp.crm.infrastructure;

import org.hibernate.Session;

/**
 * @author Ben Northrop
 */
public class SessionMaster {

	private static ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();

	public static Session getSession() {
		return threadLocal.get();
	}

	protected static void setSession(Session session) {
		threadLocal.set(session);
	}

	protected static void clearSession() {
		threadLocal.remove();
	}
}
