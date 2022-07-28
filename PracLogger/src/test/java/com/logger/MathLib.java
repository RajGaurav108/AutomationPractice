package com.logger;

import org.apache.log4j.Logger;

public class MathLib {
	static Logger logger;
	
	public MathLib(Logger logger) {
		this.logger = logger;
	}
	
	public void Add(int op1,int op2) {
		logger.debug("Add Method: Values passed are "+op1+" and "+op2);
		if (op1 < 0) {
			logger.warn("Op1 < 0");
			
		}
	}
	public void Sub(int op1,int op2) {
		logger.debug("Sub Method: Values passed are "+op1+" and "+op2);
		if (op1 < 0) {
			logger.warn("Op1 < 0");
			
		}
	}
		
	

}
