package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Employee;
import com.example.demo.pojo.TicketPojo;
import com.example.demo.service.DroolService;

@RestController
public class DroolController {

	@Autowired
	private DroolService dservice;
	
	
	@GetMapping("/")
	public String getMsg() {
		return "hiiiiiiiiiiii";
	}
	@GetMapping("/hello")
	public List<TicketPojo> getAssigne() {
		
		List<TicketPojo> d=dservice.getRuleBasedData();
		
		return d;
		
	}
}
