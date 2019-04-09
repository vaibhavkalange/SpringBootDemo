package com.example.model;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
	
	@JmsListener(destination="mailbox", containerFactory="myFactory")
	public void receiveMessage(Email email){
		System.out.println("Received Message is : " +email);
	}

}
