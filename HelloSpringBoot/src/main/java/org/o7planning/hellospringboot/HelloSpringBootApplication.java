package org.o7planning.hellospringboot;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringBootApplication {

	public static void main(String[] args) {
	    SpringApplication app = new SpringApplication(HelloSpringBootApplication.class);
        app.setDefaultProperties(Collections
          .singletonMap("server.port", "8080"));
        app.run(args);
    
	}
}
