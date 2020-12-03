package com.example.nacosdiscover.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(value="vip")
public interface OrderService
{
	@RequestMapping(value = "/buyVip", method = RequestMethod.GET)
    String buyVip();
}
