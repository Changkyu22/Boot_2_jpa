package com.iu.b1.member;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired
	MemberRepository memberRepository;
	@Autowired
	MemberFilesRepository memberFilesRepository;
	
	public MemberVO memberLogin(MemberVO memberVO)throws Exception{
		return memberRepository.findByIdAndPw(memberVO.getId(), memberVO.getPw());
	}
	
	public Optional<MemberVO> memberMypage(MemberVO memberVO)throws Exception{
		return memberRepository.findById(memberVO.getId());
	}
	
	public MemberFilesVO memberMyPage(MemberFilesVO memberFilesVO)throws Exception{
		return memberFilesRepository.findByFname(memberFilesVO.getFname());
	}

}
