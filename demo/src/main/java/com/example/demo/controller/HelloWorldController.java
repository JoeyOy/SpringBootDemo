package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author ouyanghao
 * @date 2018年11月12日
 */
@RestController
public class HelloWorldController {
	
	@RequestMapping(value=("/hello123") , method = RequestMethod.GET)
	public String index() {
		return "Hello World! 77777777777 !";
	}
}
