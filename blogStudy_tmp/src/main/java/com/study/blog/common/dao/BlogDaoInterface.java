package com.study.blog.common.dao;

import java.util.ArrayList;
import org.springframework.ui.Model;
import com.study.blog.test.model.TemplateModel;

public interface BlogDaoInterface {

	public ArrayList<TemplateModel> list();
	
	public void update(Model model);
	
}
