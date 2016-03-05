package com.study.blog.service.impl;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.ui.Model;

import com.study.blog.dao.BlogDaoInterface;
import com.study.blog.dto.TemplateModel;
import com.study.blog.service.BlogService;

public class BlogServiceTemplate implements BlogService {

	private SqlSession sqlSession;
	
	TransactionTemplate transactionTemplate;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	@Override
	public ArrayList<TemplateModel> list() throws Exception{
		
		BlogDaoInterface dao = sqlSession.getMapper(BlogDaoInterface.class);
		return dao.list();
	}
	
	@Override
	public void update(Model model) throws Exception{
		
		BlogDaoInterface dao = sqlSession.getMapper(BlogDaoInterface.class);
		dao.update(model);
	}

}
