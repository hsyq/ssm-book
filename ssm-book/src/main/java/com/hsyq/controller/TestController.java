package com.hsyq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试Controller
 * @author lijian
 * @date 2017年4月7日 下午4:31:13
 */

@Controller
@RequestMapping(value="/test")
public class TestController {

	@RequestMapping("/ok")
	public String showError() {
		return "ok";
	}
	
	@RequestMapping("/index1")
	public String showIndex(){
		return "portal/index";
	}
	
	@RequestMapping("/ajax")
	@ResponseBody
	public String getInt(){
		System.out.println(666);
		return "hello,ajax";
	}
}
