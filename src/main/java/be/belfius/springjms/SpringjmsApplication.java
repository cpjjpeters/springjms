package be.belfius.springjms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableJms
@Slf4j
public class SpringjmsApplication {

	public static void main(String[] args) {
		log.info(" starting SpringjmsApplication");
		SpringApplication.run(SpringjmsApplication.class, args);
//		execute this by using the SpringjmsApplicationTests !
	}

}
