package egovframework.let.tempCrud.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.egovframe.rte.fdl.string.EgovStringUtil;
import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.let.tempCrud.service.TempCrudService;
import egovframework.let.tempCrud.service.TempCrudVO;

@Controller
public class TempCrudController {
	
	@Resource(name = "tempCrudService")
	private TempCrudService tempCrudService;
	
	//CRUD 목록 가져오기
	@RequestMapping(value = "/tempCrud/selectList.do")
	public String selectList(TempCrudVO tempCrudVO, HttpServletRequest request, ModelMap model) throws Exception{
		PaginationInfo paginationInfo = new PaginationInfo();
		
		paginationInfo.setCurrentPageNo(tempCrudVO.getPageIndex());
		paginationInfo.setRecordCountPerPage(tempCrudVO.getPageUnit());
		paginationInfo.setPageSize(tempCrudVO.getPageSize());
		
		tempCrudVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
		tempCrudVO.setLastIndex(paginationInfo.getLastRecordIndex());
		tempCrudVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());
		
		List<EgovMap> resultList = tempCrudService.selectTempCrudList(tempCrudVO);
		model.addAttribute("resultList", resultList);
		
		int totCnt = tempCrudService.selectTempCrudListCnt(tempCrudVO);
		
		paginationInfo.setTotalRecordCount(totCnt);
		model.addAttribute("paginationInfo", paginationInfo);
		
		model.addAttribute("paginationInfo", paginationInfo);
		model.addAttribute("totCnt", totCnt);
		
		return "temCrud/TempCrudSelectList";
	}
	
	//CRUD 등록/수정
	@RequestMapping(value="/tempCrud/tempCrudRegist.do")
	public String tempCrudRegist(TempCrudVO tempCrudVO, HttpServletRequest request, ModelMap model) throws Exception{
		TempCrudVO result = new TempCrudVO();
		if(!EgovStringUtil.isEmpty(tempCrudVO.getcrudId())) {
			result = tempCrudService.selectTemp(tempCrudVO);
		}
		model.addAttribute("result", result);
		
		return "tempCrud/TempCrudRegist";
	}
	
	//CRUD 등록하기
	@RequestMapping(value="/tempCrud/insert.do")
	public String insert(TempCrudVO tempCrudVO, HttpServletRequest request, ModelMap model) throws Exception{
		tempCrudService.insertTemp(tempCrudVO);
		return "forward:/temp2/selectList.do";
	}
	
	//CRUD 수정하기
	@RequestMapping(value="/tempCrud/update.do")
	public String update(TempCrudVO tempCrudVO, HttpServletRequest request, ModelMap model) throws Exception{
		tempCrudService.updateTemp(tempCrudVO);
		return "forward:/tempCrud/selectList.do";
	}
	
	//CRUD 가져오기
	@RequestMapping(value = "/tempCrud/select.do")
	public String select(TempCrudVO tempCrudVO, HttpServletRequest request, ModelMap model) throws Exception{
		TempCrudVO result = tempCrudService.selectTemp(tempCrudVO);
		model.addAttribute("result", result);
		return "tempCrud/TempSelect";
	}
	
	//CRUD 삭제하기
	@RequestMapping(value="/tempCrud/delete.do")
	public String delete(TempCrudVO tempCrudVO, HttpServletRequest request, ModelMap model) throws Exception{
		tempCrudService.deleteTemp(tempCrudVO);
		return "forward:/tempCrud/selectList.do";
	}
}