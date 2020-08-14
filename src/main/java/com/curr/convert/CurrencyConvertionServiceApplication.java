package com.curr.convert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableFeignClients("com/curr/convert")
@EnableDiscoveryClient
public class CurrencyConvertionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConvertionServiceApplication.class, args);
		System.out.println("Currency Convertor is running!!!!");
	}
	
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

}
