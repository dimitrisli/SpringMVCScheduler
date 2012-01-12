package com.dimitrisli.springmvc.scheduling;

import org.apache.log4j.Logger;

public class FixedRateServiceImpl implements Service {

	protected static Logger logger = Logger.getLogger("service");

	public void performService() {
		String threadName = Thread.currentThread().getName();
		logger.debug("   " + threadName + " fixed rate service performing important stuff..");
	}
}
