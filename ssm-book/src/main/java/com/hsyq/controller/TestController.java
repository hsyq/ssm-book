package com.hsyq.controller;

import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.hsyq.pojo.User;

/**
 * 测试Controller
 * @author lijian
 * @date 2017年4月7日 下午4:31:13
 */

@Controller
@RequestMapping(value="/test")
public class TestController {

	@RequestMapping("/aaa")
	public String getName(){
		return "user";
	}
	
	@RequestMapping("/aa")
	public String showIndex1(){
		return "protal/index";
	}
	
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
	
	/**
	 * 测试 发送Json数据
	* 
	* @param user       
	*
	 */
	@RequestMapping("/sendJson")
	@ResponseBody
	/*public void getJson(@RequestBody User user) {
		System.out.println(user);
		System.out.println(user.getUserId());
	} */
	public User getJson(@RequestBody User user) {
		return user;
	}
	/**
	 * 测试springmvc上传图片
	* 
	* @param imageName
	* @return       
	*
	 */
	@RequestMapping("/upimg")
	public String uploadImg(MultipartFile imageName){
		String fileName = imageName.getName();
		UUID.randomUUID();
		return "index";
	}
}
