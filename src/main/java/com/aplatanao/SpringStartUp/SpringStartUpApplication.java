package com.aplatanao.SpringStartUp;

import com.aplatanao.SpringStartUp.services.AccountingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringStartUpApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringStartUpApplication.class, args);

		AccountingService service = ctx.getBean(AccountingService.class);
		System.out.println(service);
	}
}
