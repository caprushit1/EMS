package com.caprusit.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	static private SessionFactory factory;
	private HibernateUtil(){}
	public synchronized static  SessionFactory getFactory(){
		
		if(factory==null){
			
			factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
					
			
		}
		// only for test
		return factory;
	} 
	
}
