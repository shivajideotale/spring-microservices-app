package app.guest.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AppGuestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppGuestServiceApplication.class, args);
	}

}
