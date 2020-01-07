package com.iu.b1.member;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/member/**")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	
//	@GetMapping("memberFileDown")
//	public ModelAndView memberFileDown(MemberFilesVO memberFilesVO) throws Exception{
//		ModelAndView mv = new ModelAndView();
//		memberFilesVO = memberService.memberFilesSelect(memberFilesVO);
//		if(memberFilesVO != null) {
//			mv.addObject("memberfiles", memberFilesVO);
//			mv.addObject("path", "upload");
//			mv.setViewName("fileDown");
//		}else {
//			mv.addObject("message", "No Image");
//			mv.addObject("path", "./memberMypage");
//			mv.setViewName("common/result");
//		}
//		return mv;
//	}
	
	@GetMapping("memberMypage")
	public ModelAndView memberMypage(MemberVO memberVO, HttpSession session, MemberFilesVO memberFilesVO) throws Exception{
		ModelAndView mv = new ModelAndView();
		memberVO = (MemberVO)session.getAttribute("member");
		Optional<MemberVO> ar = memberService.memberMypage(memberVO);
		memberFilesVO = memberService.memberMyPage(memberFilesVO);
		mv.addObject("file", memberFilesVO);
		mv.addObject("member", ar);
		mv.setViewName("member/memberMypage");
		
		return mv;
	}
	
	@GetMapping("memberLogout")
	public String memberLogout(HttpSession session)throws Exception{
		session.invalidate();
		return "redirect:../";
	}
	
	@GetMapping("memberLogin")
	public String memberLogin()throws Exception{
		return "member/memberLogin";
	}
	
	@PostMapping("memberLogin")
	public ModelAndView memberLogin(MemberVO memberVO, HttpSession session) throws Exception{
		ModelAndView mv= new ModelAndView();
		memberVO = memberService.memberLogin(memberVO);
		String message = "Join Fail";
		String path = "../";
		if(memberVO!=null) {
			message = "Join Success";
			session.setAttribute("member", memberVO);
		}
		mv.setViewName("common/result");
		mv.addObject("message", message);
		mv.addObject("path", path);
		
		return mv;
	}
	
//	@GetMapping("memberJoin")
//	public String memberJoin(MemberVO memberVO) throws Exception{
//		// MemberVO memberVO = new MemberVO();
//		// model.addAttribute("memberVO", new MemberVO()); 와 같은 것
//		return "member/memberJoin";
//	}
//	
//	@PostMapping("memberJoin")
//	public ModelAndView memberJoin(@Valid MemberVO memberVO, BindingResult bindingResult, MultipartFile files)throws Exception{
//		ModelAndView mv = new ModelAndView();
//		
//		if(memberService.memberJoinValidate(memberVO, bindingResult)) {
//			mv.setViewName("member/memberJoin");
//		}else {
//			int result = memberService.memberJoin(memberVO, files);
//			String message = "Join Fail";
//			String path = "../";
//			if(result > 0) {
//				message = "Join Success";
//			}
//			mv.setViewName("common/result");
//			mv.addObject("message", message);
//			mv.addObject("path", path);
//		}
//		return mv;
//	}
}
