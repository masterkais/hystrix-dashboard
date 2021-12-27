package com.iit.imprimerie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardV1Application {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardV1Application.class, args);
	}

}
