package com.coco;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coco.dao.UserDao;
import com.coco.model.User;

@Controller
@RequestMapping("/user")
public class Test {
	private Logger logger = Logger.getLogger(Test.class);
	@Autowired
	private UserDao dao;

	@RequestMapping("/test")
	public String test(@RequestParam int id) {
		User user = dao.findById(id);
		logger.info("============" + id);
		return "";
	}

}
