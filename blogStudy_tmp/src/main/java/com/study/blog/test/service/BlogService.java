package com.study.blog.test.service;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.study.blog.test.model.TemplateModel;

public interface BlogService {

	// ���� ������ Interface
	// ��� service implement �� ��ü���� �ش� execute �޼ҵ带 �����Ѵ�.
	// ��� service ��ü���� parent ��ü (������)
	// Exception�� Controller�� throw
	
	public ArrayList<TemplateModel> retrieveList();
	
	public void updateTemplate(Model model);
}
