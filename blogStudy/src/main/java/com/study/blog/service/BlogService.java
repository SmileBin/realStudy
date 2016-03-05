package com.study.blog.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.study.blog.dto.TemplateModel;

@Service
public interface BlogService {

	// ���� ������ Interface
	// ��� service implement �� ��ü���� �ش� execute �޼ҵ带 �����Ѵ�.
	// ��� service ��ü���� parent ��ü (������)
	// Exception�� Controller�� throw
	
	public ArrayList<TemplateModel> list()throws Exception;
	public void update(Model model) throws Exception;
}
