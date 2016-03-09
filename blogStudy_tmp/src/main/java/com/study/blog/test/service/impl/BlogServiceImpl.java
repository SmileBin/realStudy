package com.study.blog.test.service.impl;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.ui.Model;

import com.study.blog.common.dao.BlogDaoInterface;
import com.study.blog.common.dao.CommonDAO;
import com.study.blog.test.model.TemplateModel;
import com.study.blog.test.service.BlogService;

@Service("blogServiceTemplate")
public class BlogServiceImpl implements BlogService {

	@Resource(name="commonDao")
	private CommonDAO commonDao;
	
	TransactionTemplate transactionTemplate;
	
	
//	public void setSqlSession(SqlSession sqlSession) {
//		this.sqlSession = sqlSession;
//	}
	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	@Override
	public ArrayList<TemplateModel> retrieveList(){
		
//		sqlSession.getSqlMapClientTemplate
		//BlogDaoInterface dao = sqlSession.getMapper(BlogDaoInterface.class);
	//	return commonDao.selectList("com.study.blog.test.model.TemplateModel");
		return null;
	}
	
	@Override
	public void updateTemplate(Model model){
		
		//BlogDaoInterface dao = sqlSession.getMapper(BlogDaoInterface.class);
		//dao.update(model);
	}

}
