package main.java.communicator;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommController {

    //private static final String template = "Hello, %s!";
    //private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/communication")
    public String sendMessage(@RequestParam(value="type", defaultValue="email") String type,
    		                   @RequestParam(value="from", defaultValue="targetFrom") String from,
    		                   @RequestParam(value="to", defaultValue="targetTo") String to,
    		                   @RequestParam(value="body", defaultValue="Empty Content") String body  
    		) 
    {
    	
    	Message msgObj = new Message(from,to,body);
    	
    	CommService commServiceObj =  new CommService();
    	
    	if (commServiceObj.dispatchMessage(type,msgObj))
    	 	return "Message sent" + msgObj.toString();
    	else
    		return "No message sent";
    }
}
