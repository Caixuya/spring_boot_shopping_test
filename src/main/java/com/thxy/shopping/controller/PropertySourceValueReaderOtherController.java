package com.thxy.shopping.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource(value = { "test.properties", "ok.properties" })
public class PropertySourceValueReaderOtherController {
	@Value("${my.msg}")
	private String mymsg;
	@Value("${your.msg}")
	private String yourmsg;

	@RequestMapping("/testPropertySourceValue")
	public String testProperty() {
		return "其他配置文件test.properties:" + mymsg + "<br>" + "其他配置文件ok.properties:" + yourmsg;
	}
}
