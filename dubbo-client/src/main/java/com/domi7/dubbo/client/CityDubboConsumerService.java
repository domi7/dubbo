package com.domi7.dubbo.client;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.domi7.dubbo.domain.City;
import com.domi7.dubbo.service.CityDubboService;

/**
 * 消费服务
 * 
 * @author domi7
 * @since 2017年5月30日
 */
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
