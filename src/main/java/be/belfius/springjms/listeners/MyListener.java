package be.belfius.springjms.listeners;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MyListener {
	@JmsListener(destination = "${springjms.myQueue}")
	public void receiveMessage(String message) {
		log.info("MyListener in project springjms is receiving");
		System.out.println("Message received ====>"+message);
	}

}
