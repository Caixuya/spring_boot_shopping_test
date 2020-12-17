package com.thxy.shopping.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnnotationValueReaderConfigController {

		@Value("${test.msg}")
		private String msg;

		@RequestMapping("/testValue") public String testEnv(){ 
			return "方法一" + msg; // test.msg为配置文件application.properties中的key } }
		
		}
}

	