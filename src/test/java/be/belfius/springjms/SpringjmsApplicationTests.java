package be.belfius.springjms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import be.belfius.springjms.senders.MessageSender;

@SpringBootTest
class SpringjmsApplicationTests {

	@Autowired
	MessageSender sender;
	@Test
	void testSendAndReceive() {
		System.out.println("createStringFromFile()");
		StringBuilder sb = new StringBuilder();
		String returnStr = "returnstring";
		try {
		BufferedReader reader = new BufferedReader(new FileReader("D:\\Data\\17L07462.txt"));
		char[] buf = new char[1024];
		int numRead = 0;
		while((numRead = reader.read(buf)) != -1) {
			String readData = String.valueOf(buf, 0, numRead);
			sb.append(readData);
			buf = new char[1024];
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
		returnStr=sb.toString();
		sender.send(returnStr);
		sender.send("Hello Spring JMS !!!");
	}

}
