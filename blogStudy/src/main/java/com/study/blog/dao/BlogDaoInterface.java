package com.study.blog.dao;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.study.blog.dto.TemplateModel;

public interface BlogDaoInterface {

	public ArrayList<TemplateModel> list();
	
	public void update(Model model);
	
}
