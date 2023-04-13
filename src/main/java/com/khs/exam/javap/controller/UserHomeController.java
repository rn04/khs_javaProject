package com.khs.exam.javap.controller; //클래스를 모아놓은 폴더

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller //annotation: 컨트롤러라고 스프링에게 알려주는 용도
public class UserHomeController{
	private int count = 0;

	public UserHomeController() {
		count = -1;
	}
	
	@RequestMapping("/user/home/main")
	@ResponseBody
	public String showMain(){
		return "안녕";
		
	}
	
	@RequestMapping("/user/home/main2")
	@ResponseBody
	public String showMain2(){
		return "와";
		
	}
	
	@RequestMapping("/user/home/main3")
	@ResponseBody
	public String showMain3(){
		return "그래";
		
	}
	
	@RequestMapping("/user/home/getCount")
	@ResponseBody
	public int getCount(){
		
		count++;
		
		return count;
		
	}

	@RequestMapping("/user/home/doSetCount")
	@ResponseBody
	public String doSetCount(){
		
		this.count = count;
		
		return "count의 값이 " + this.count + "으로 초기화";
		
	}
}

