package com.blockstorage.model;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App {

	public static void main(String args[])
	{
		//SessionFactory sf = new Configuration().configure().buildSessionFactory();
		String deviceId="2";
		int hashkey = deviceId.hashCode();
		System.out.println(hashkey);
		//.out.println(Math.sqrt((10-7)));
		
	}
}
