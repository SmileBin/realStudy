package com.study.blog.test.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.blog.test.service.BlogService;


// Controller는 단일 컨틀롤러 갈 예정
@Controller
public class BlogStart {
	
	@Resource(name="blogServiceTemplate")
	public BlogService blogService;

//	@Autowired
//	public void setBlogService(BlogService blogService) {
//		this.blogService = blogService;
//	}
	
	// template 용으로 기본 메소드 생성
	@RequestMapping("/template.do")
	public String template(Model model){
		
		try {
			
			model.addAttribute("result", blogService.retrieveList());
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "blog/template";
	}
	
	@RequestMapping("/update.do")
	public String updateTemplate(Model model){
		
		try {
			
			model.addAttribute("bId", 1);
			model.addAttribute("bTitle", " is title 2");
			model.addAttribute("bName", " Test ");
			
			blogService.updateTemplate(model);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "redirect:template";
	}
	
}
