package com.extent;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;


public class LogExample {

	
	final static Logger logger = Logger.getLogger(LogExample.class);
	public static void main(String[] args) {
		LogExample logExample = new LogExample();
        logger.setLevel(Level.INFO);
		logExample.printLogs("CISCO");
	}
	private void printLogs(String logValue) {
		if(logger.isDebugEnabled()) {
			System.out.println("Inside debug");
			logger.debug("The debug message value is "+logValue);
			
		}else if (logger.isInfoEnabled()) {
			System.out.println("Inside INFO");
			logger.info("The INFO message value is "+logValue);
		}
	}

}
