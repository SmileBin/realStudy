package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.Member;
import com.example.domain.MemberDetail;
import com.example.repository.MemberRepository;

@Controller
public class MemberController {
	@Autowired MemberRepository repository;	
	
	@RequestMapping("member")
	@ResponseBody
	public String member(){
		Member member = new Member();
		member.setName("arahansa");	
		MemberDetail memberDetail = new MemberDetail();
		memberDetail.setAddress("incheon");
		member.setMemberDetail(memberDetail);
		repository.save(member);
		return member.toString();
	}
}