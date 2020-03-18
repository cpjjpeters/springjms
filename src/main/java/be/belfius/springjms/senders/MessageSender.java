package be.belfius.springjms.senders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MessageSender {
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Value(value = "${springjms.myQueue}")
	private String queue;
	
	public void send(String message) {
		log.info("sending in project springjms");
		jmsTemplate.convertAndSend(queue, message);
		
//		MessageCreator mc = new MessageCreator() {
//
//			@Override
//			public Message createMessage(Session session) throws JMSException {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//		};
//		jmsTemplate.send(queue, mc);
//	MessageCreator mc = s ->s.createTextMessage("Put your text here !");
//	jmsTemplate.send(queue, mc);
	}

}
