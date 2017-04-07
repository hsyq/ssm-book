package com.hsyq.controller;

import org.apache.activemq.filter.function.regexMatchFunction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 页面跳转
 * @author lijian
 * @date 2017年4月5日 上午11:42:08
 */

@Controller
@RequestMapping("/manager")
public class PageController {
	
	@RequestMapping("/")
	public String showManagerPage(){
		return "manager/index";
	}
	
	@RequestMapping("/{page}")
	public String showManagerPage(@PathVariable String page) {
		return "manager/"+page;
	}
	
	
	
}
