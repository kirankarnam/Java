package com.semaphore.db;

/*
 * Thread safe singleton class used to create and return the database instance It will create only 1 instance
 *  of the dbmanager class for the whole applications
 */
public class dbManager {
	
	private dbManager(){
	}
	
	public static dbManager instance = null;
	
	public synchronized static dbManager getinstance(){
		if(instance == null){
			instance = new dbManager();
		}
		return instance;
	}

	public void save(String text) {
		
	}

}
