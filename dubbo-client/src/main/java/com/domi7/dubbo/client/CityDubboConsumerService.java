package com.domi7.dubbo.client;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.domi7.dubbo.domain.City;
import com.domi7.dubbo.service.CityDubboService;

@Component
public class CityDubboConsumerService {

	@Reference(version = "1.0.0")
	CityDubboService cityDubboService;

	public void printCity() {
		String cityName = "温岭";
		City city = cityDubboService.findCityByName(cityName);
		System.out.println(city.getCityName() + ":" + city.getDescription());
	}

}
