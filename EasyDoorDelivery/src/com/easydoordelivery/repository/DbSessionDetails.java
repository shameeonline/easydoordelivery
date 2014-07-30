package com.easydoordelivery.repository;

import org.hibernate.Session;

public interface DbSessionDetails {
	public  void beginSession();
	public void endSession(Session session);
}
