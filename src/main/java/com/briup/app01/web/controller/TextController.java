package com.briup.app01.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TextController {

	/**
	 * http://localhost:8080/
	* */
	@GetMapping("a")
	public String a(){
		return "dadada";
	}

	@GetMapping("b")
	public String b(){
	return "啦啦啦";
	}
	public  static void main(String[] args){}
	}


