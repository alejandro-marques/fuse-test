package org.amarques.test.fuse.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HealthService {
	
	private static final Logger logger = LoggerFactory.getLogger(HealthService.class);

	public String ping () {
		logger.info("Received health request");
		return "{ \"service\" : \"Fuse Test\", \"status\" : \"OK\"}";
	}
}