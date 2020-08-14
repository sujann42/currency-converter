package com.curr.convert.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.curr.convert.bean.CurrencyConversionBean;

//@FeignClient(name = "currency-exchange-service")
//This will call the naming server to get the uri for the exchange service
@FeignClient(name = "netflix-zuul-api-gateway-server") 
@RibbonClient(name = "currency-exchange-service")
public interface CurrencyExchangeServiceProxy {

	//@GetMapping("/currency-exchange/from/{from}/to/{to}")
	@GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveExchageValue(@PathVariable("from") String from, @PathVariable("to") String to);
}
