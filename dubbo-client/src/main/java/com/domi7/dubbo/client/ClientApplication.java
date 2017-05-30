package com.domi7.dubbo.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 客户端启动类
 * 
 * @author domi7
 * @since 2017年5月30日
 */
@SpringBootApplication
public class ClientApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(ClientApplication.class, args);
		CityDubboConsumerService cityService = run.getBean(CityDubboConsumerService.class);
		cityService.printCity();

	}

}
