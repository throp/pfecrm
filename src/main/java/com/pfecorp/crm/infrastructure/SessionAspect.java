/**
 * Copyright - Property of PFE Corportation
 */
package com.pfecorp.crm.infrastructure;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * @author Ben Northrop
 */
@Aspect
public class SessionAspect {

	private SessionFactory sessionFactory;

	public Object openSession(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("opening session");
		Session session = sessionFactory.openSession();
		SessionMaster.setSession(session);
		try {
			session.beginTransaction();
			return pjp.proceed();
		} finally {
			session.getTransaction().commit();
			session.close();
			SessionMaster.clearSession();
			System.out.println("closed session");
		}
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
