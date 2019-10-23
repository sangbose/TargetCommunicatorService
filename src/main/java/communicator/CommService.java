package main.java.communicator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service("CommService")
public class CommService {
	
	 public boolean dispatchMessage(String messageType, Message msgObj) {
		 
		 JmsTemplate jmsTemplate = AppContextAware.getApplicationContext().getBean(JmsTemplate.class);

	     // Send the message
	     if (messageType.equals("email"))
	    	 jmsTemplate.convertAndSend("emailChannel", msgObj);
	     else
	    	 jmsTemplate.convertAndSend("slackChannel", msgObj);
	        
	     return true;
	   }
}
