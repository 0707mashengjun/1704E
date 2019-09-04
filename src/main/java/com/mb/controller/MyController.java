package com.mb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mb.service.MyService;

@Controller
public class MyController {
	
	@Autowired
	private MyService service;
}
