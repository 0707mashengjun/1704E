package com.mb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mb.dao.MyDao;

@Service
public class MyServiceImpl implements MyService {
	
	@Autowired
	private MyDao dao;
	
	
}
