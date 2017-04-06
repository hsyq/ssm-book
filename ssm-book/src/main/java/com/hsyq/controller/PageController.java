package com.hsyq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转
 * @author lijian
 * @date 2017年4月5日 上午11:42:08
 */

@Controller
public class PageController {
	
	@RequestMapping("/manager")
	public String showManagerPage(){
		return "manager/index";
	}
	
	@RequestMapping("/manager/{page}")
	public String showManagerPage(@PathVariable String page) {
		return "manager/"+page;
	}
	
	@RequestMapping("/test")
	public String showError() {
		return "ok";
	}
	
}
