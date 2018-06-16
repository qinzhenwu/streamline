package com.coco;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class Test {
	private Logger logger = Logger.getLogger(Test.class);

	@RequestMapping("/test")
	public String test(@RequestParam String name) {
		logger.info("============" + name);
		return "";
	}
}
