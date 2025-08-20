package egovframework.let.join.web;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import egovframework.com.cmm.LoginVO;
import egovframework.com.cmm.service.EgovFileMngService;
import egovframework.com.cmm.service.EgovFileMngUtil;
import egovframework.com.cmm.service.FileVO;
import egovframework.com.cmm.util.EgovUserDetailsHelper;
import egovframework.let.board.service.BoardService;
import egovframework.let.board.service.BoardVO;
import egovframework.let.join.service.JoinVO;
import egovframework.let.temp.service.TempService;
import egovframework.let.temp.service.TempVO;
import egovframework.let.temp2.service.Temp2Service;
import egovframework.let.temp2.service.Temp2VO;
import egovframework.let.utl.fcc.service.EgovStringUtil;
import net.sf.json.JSONObject;

@Controller
public class JoinController {
	
	//약관동의
	@RequestMapping(value = "/join/siteUseAgree.do")
	public String siteUseAgree(@ModelAttribute("searchVO") JoinVO vo,  HttpServletRequest request
			, ModelMap model, HttpSession session) throws Exception{
		
		return "join/SiteUseAgree";
	}
	
	//회원구분
	@RequestMapping(value = "/join/memberType.do")
	public String memberType(@ModelAttribute("searchVO") JoinVO vo,  HttpServletRequest request, ModelMap model, HttpSession session) throws Exception{
		//약관동의
		if(!"Y".equals(vo.getAgree01()) || !"Y".equals(vo.getAgree02())) {
			model.addAttribute("message", "잘못 된 접근입니다.");
			return "forward:/join/siteUseAgree.do";
		}
		
		return "join/MemberType";
	}
	
	//회원등록 폼
	@RequestMapping(value = "/join/memberRegist.do")
	public String memberRegist(@ModelAttribute("searchVO") JoinVO vo,  HttpServletRequest request, ModelMap model) throws Exception{
		//약관동의
		if(!"Y".equals(vo.getAgree01()) || !"Y".equals(vo.getAgree02())) {
			model.addAttribute("message", "잘못 된 접근입니다.");
			return "forward:/join/siteUseAgree.do";
		//회원유형선택여부	
		}else if(EgovStringUtil.isEmpty(vo.getLoginType())) {
			model.addAttribute("message", "잘못 된 접근입니다.");
			return "forward:/join/siteUseAgree.do";
		}
		
		return "join/MemberRegist";
	}
	
	//아이디 중복체크
	@RequestMapping(value = "/join/duplicateCheck.do")
	public void duplicateCheck(@ModelAttribute("searchVO") JoinVO vo, HttpServletRequest request, HttpServletResponse response, 
			ModelMap model) throws Exception{
		
		String successYn = "Y";
		String message = "성공";
		
		JSONObject jo = new JSONObject();
    	response.setContentType("application/json; charset=utf-8");
    	
    	int duplicateCnt = 0;//joinService.duplicateCheck(vo);
		if(duplicateCnt > 0) {
			successYn = "N";
			message = "이미 사용중인 ID입니다.";
		}
    	
		jo.put("successYn", successYn);
		jo.put("message", message);
		
		PrintWriter printwriter = response.getWriter();
    	printwriter.println(jo.toString());
		printwriter.flush();
		printwriter.close();
	}
}












