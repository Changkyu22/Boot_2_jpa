package com.iu.b1.member;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MemberRepositoryTest {

	@Autowired
	private MemberRepository memberRepository;
	
	@Test
	void test() throws Exception{
		
//		Long count = memberRepository.count();
//		Boolean check = memberRepository.existsById("ck");
//		List<MemberVO> ar = memberRepository.findAll();
//		Optional<MemberVO> op = memberRepository.findById("aa");
//		if(op.isPresent()) {
//			MemberVO memberVO = op.get();
//			System.out.println(memberVO.getEmail());
//		}else {
//			System.out.println("No!!!!!!!!!!!!!!!!!!!!!!!!!");
//		}
		
//		MemberVO memberVO = new MemberVO();
//		memberVO.setId("nuri8");
//		memberVO.setPw("nuri8");
//		memberVO.setName("ReName");
//		memberRepository.save(memberVO);
//	}
	
		MemberVO memberVO = new MemberVO();
		memberVO.setId("nuri4");
		memberVO.setPw("nuri4");
		memberVO.setName("Rename");
		
		MemberVO member = memberRepository.findByIdAndPw("nuri10", "nuri10");
		System.out.println(member.getName());
		
	}
		
		

}
