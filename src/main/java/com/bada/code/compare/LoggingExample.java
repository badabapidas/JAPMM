package com.bada.code.compare;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Sometime unneccesary loggin is add some overhead. So its better to always
 * check the logger before logging if in your loggin statement any kind of
 * processing is happening which might take some resource
 * 
 * @author bada
 *
 */
public class LoggingExample {

	Logger logger = Logger.getLogger("My Logger");

	public void exampleMethod() {

		try {
			// some code
		} catch (NumberFormatException e) {
			if (logger.isLoggable(Level.INFO)) {
//			logger.log(Level.INFO, "NFE in exampleMethod. " 
//				+ "error was : " + e.getMessage() + 
//				" user was : " + currentUser.getId() + " " + currentUser.getName()) + 
//				" system was : " + currentTerminal.getId() + " "  + currentTerminal.getLocationName());
			}
		}
	}

}
