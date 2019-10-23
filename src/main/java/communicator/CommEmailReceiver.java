package main.java.communicator;

import java.time.LocalDateTime;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class CommEmailReceiver {

    @JmsListener(destination = "emailChannel", containerFactory = "myFactory")
    public void receiveMessage(Message message) {
    	System.out.println(LocalDateTime.now());
        System.out.println("Email Channel Received - <" + message + ">");
    }
}