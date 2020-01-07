package com.iu.b1.member;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MemberFilesRepositoryTest {

	@Autowired
	private MemberFilesRepository memberFilesRepository;
	
	@Test
	void test() throws Exception{
//		List<MemberFilesVO> ar = memberFilesRepository.findAll();
//		for (MemberFilesVO memberFilesVO : ar) {
//			System.out.println(memberFilesVO.getFname());
//		}
		
//		Boolean check = memberFilesRepository.existsById(2);
//		System.out.println(check);
		
//		Optional<MemberFilesVO> opt = memberFilesRepository.findById(1);
//		Optional<MemberFilesVO> opt2 = memberFilesRepository.findById(1);
//		MemberFilesVO memberFilesVO = opt.get();
//		MemberFilesVO memberFilesVO2 = opt2.get();
//		System.out.println(memberFilesVO == memberFilesVO2);
		
//		MemberFilesVO memberFilesVO = new MemberFilesVO();
//		memberFilesVO.setId("ck");
//		memberFilesVO.setFname("누리바보");
//		memberFilesVO.setOname("누 리 바 보");
//		memberFilesRepository.save(memberFilesVO);
		
//		List<MemberFilesVO> ar = memberFilesRepository.findById("ckck");
//		for (MemberFilesVO memberFilesVO : ar) {
//			System.out.println(memberFilesVO.getId());
//			System.out.println(memberFilesVO.getFname());
//		}
		
		List<MemberFilesVO> ar = memberFilesRepository.findById("ckck");
		for (MemberFilesVO memberFilesVO : ar) {
			System.out.println(memberFilesVO.getFname());
		}
		
		
	}

}
