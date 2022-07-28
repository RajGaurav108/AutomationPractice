package com.logger;

import java.io.IOException;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class LoggerExample {
	
    static Logger logger = Logger.getLogger(LoggerExample.class);
    
	public static void main(String[] args) {
		
		SimpleLayout layout = new SimpleLayout();
		
		try {
			FileAppender appender = new FileAppender(layout, "Output.log", false);
			logger.addAppender(appender);
			logger.setLevel(Level.DEBUG);
			logger.debug("This is Debug message");
			logger.info("Infor message");
			logger.error("Error message");
			
			MathLib lib = new MathLib(logger);
			lib.Add(-2,20);
			lib.Sub(-2,20);
			
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
