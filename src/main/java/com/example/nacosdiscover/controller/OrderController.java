package com.example.nacosdiscover.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nacosdiscover.service.OrderService;



@RestController
public class OrderController
{
	@Resource
	OrderService vip;
	
	@RequestMapping("/createOrder")
	public String createOrder()
	{
		System.out.println("下单成功："+Thread.currentThread().getName());
		
		this.vip.buyVip();
		return "suc";
	}
}
