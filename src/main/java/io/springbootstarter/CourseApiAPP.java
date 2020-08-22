package io.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"io.springbootstarter"})
public class CourseApiAPP {

	public static void main(String[] args) {
		// sets up default configuration
		//starts application context
		//performs class path scan
		//start servlet container 
		//host the application in the server
		SpringApplication.run(CourseApiAPP.class, args);
	}

}
