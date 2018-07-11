package org.amarques.test.fuse.processor;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResponseProcessor {
	
	private static final Logger logger = LoggerFactory.getLogger(ResponseProcessor.class);
	
	public void process (Exchange exchange) {
		logger.info("Processing response");
		
		System.out.println("Code: " + exchange.getProperty(Exchange.HTTP_RESPONSE_CODE));
		System.out.println("Message: " + exchange.getIn().getBody().toString());
		System.out.println("Class: " + exchange.getIn().getBody().getClass());
		System.out.println("Response: " + exchange.getProperty(Exchange.HTTP_SERVLET_RESPONSE));
	}
}
