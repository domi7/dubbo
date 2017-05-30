package com.domi7.dubbo.server;

import com.alibaba.dubbo.config.annotation.Service;
import com.domi7.dubbo.domain.City;
import com.domi7.dubbo.service.CityDubboService;

@Service(version = "1.0.0")
public class CityDubboServiceImpl implements CityDubboService {
	public City findCityByName(String cityName) {
		return new City(1L, 2L, "温岭", "是我的故乡");
	}

}
