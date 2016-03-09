package com.study.blog.test.service;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.study.blog.test.model.TemplateModel;

public interface BlogService {

	// 서비스 영역의 Interface
	// 모든 service implement 한 객체들은 해당 execute 메소드를 구현한다.
	// 모든 service 객체들의 parent 객체 (다형성)
	// Exception은 Controller로 throw
	
	public ArrayList<TemplateModel> retrieveList();
	
	public void updateTemplate(Model model);
}
