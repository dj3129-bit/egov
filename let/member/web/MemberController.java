package egovframework.let.member.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.egovframe.rte.fdl.string.EgovStringUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.let.member.service.MemberService;
import egovframework.let.member.service.MemberVO;

@Controller
public class MemberController {
	
	@Resource(name = "memberService")
	private MemberService memberService;
	
	//회원ID 찾기
	@RequestMapping(value = "/member/findId.do")
	public String findId(@ModelAttribute("searchVO") MemberVO vo, HttpServletRequest request, ModelMap model, HttpSession session) throws Exception{
		
		return "/member/FindId";
	}
	
	//회원 ID 찾기 완료
	@RequestMapping(value = "/member/findIdComplete.do")
	public String findIdComplete(@ModelAttribute("searchVO") MemberVO vo, HttpServletRequest request, ModelMap model, HttpSession session) throws Exception{
		
		MemberVO result = memberService.findId(vo);
		if(result == null || EgovStringUtil.isEmpty(result.getEmplyrId())) {
			model.addAttribute("message", "가입된 회원정보가 없습니다.");
			return "forward:/member/findId.do";
		}
		model.addAttribute("result", result);
		
		return "/member/FindIdComplete";
	}
	
	//회원 비밀번호 찾기
	@RequestMapping(value = "/member/findPassword.do")
	public String findPassword(@ModelAttribute("searchVO") MemberVO vo, HttpServletRequest request, ModelMap model, HttpSession session) throws Exception{
			
		return "/member/FindPassword";
	}
	
	//회원비밀번호수정
	@RequestMapping(value = "/member/findPasswordRegist.do")
	public String findPasswordRegist(@ModelAttribute("searchVO") MemberVO vo, HttpServletRequest request, ModelMap model, HttpSession session) throws Exception{
			
		MemberVO result = memberService.findPassword(vo);
		if(result == null || EgovStringUtil.isEmpty(result.getEmplyrId())) {
			model.addAttribute("message", "가입된 회원정보가 없습니다.");
			return "forward:/member/findPassword.do";
		}
		model.addAttribute("result", result);
			
		return "/member/FindPasswordRegist";
	}
	
	//회원 비밀번호 업데이트
	@RequestMapping(value = "/member/findPasswordComplete.do")
	public String findPasswordComplete(@ModelAttribute("searchVO") MemberVO vo, HttpServletRequest request, ModelMap model, HttpSession session) throws Exception{
				
		memberService.passwordUpdate(vo);
		model.addAttribute("loginMessage", "비밀번호가 업데이트되었습니다.");
		
		return "/member/FindPassword";
	}
}
