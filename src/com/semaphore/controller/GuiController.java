package com.semaphore.controller;

import com.semaphore.db.dbManager;

/*
 * controller used to separate the GUi Client from the back end database and business operations
 */

public class GuiController {

	public void saveText(String text) {
		dbManager manager = dbManager.getinstance();
		manager.save(text);

	}

}
