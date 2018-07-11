package org.amarques.test.fuse.processor;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResponseProcessor {
	
	private static final Logger logger = LoggerFactory.getLogger(ResponseProcessor.class);
	
	public void process (Exchange exchange) {
		logger.info("Processing response...");
		
		Integer code = (Integer) exchange.getIn().getHeader(Exchange.HTTP_RESPONSE_CODE);
		String contentType = (String) exchange.getIn().getHeader(Exchange.CONTENT_TYPE);
		String message = exchange.getIn().getBody(String.class);
		
		logger.info("Response: [Code: " + code + " / Type: " + contentType + " / Message: " + message + "]");
	}
}
