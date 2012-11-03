package se.supportix.camelreboot.beans;

import org.apache.camel.Exchange;
import org.apache.camel.Header;
import org.apache.camel.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class FixerBean {

	private static final Logger logger = LoggerFactory.getLogger(FixerBean.class);
	
	public void setCorrectValues(Object inmessage,Exchange exchange) {
		logger.info("{} I did nothing here, but autowiring in Spring, connection to databases and more is possible.", inmessage);
		
	}
	
	public void bindMessage(Message message) {
		logger.info("Message body: " + message.getBody());
	}
	
	public void bindAHeader(@Header("breadcrumbId") String camelId ) {
		logger.info("Message ID: " + camelId);
	}
	
}
