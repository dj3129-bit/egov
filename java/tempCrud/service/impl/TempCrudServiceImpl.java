package egovframework.let.tempCrud.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.egovframe.rte.fdl.idgnr.EgovIdGnrService;
import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.springframework.stereotype.Service;

import egovframework.let.tempCrud.service.TempCrudService;
import egovframework.let.tempCrud.service.TempCrudVO;

@Service("tempCrudService")
public class TempCrudServiceImpl extends EgovAbstractServiceImpl implements TempCrudService{
	
	@Resource(name = "tempCrudDAO")
	private TempCrudDAO tempCrudDAO;
	
	@Resource(name = "egovCrudIdGnrService")
	private EgovIdGnrService idgenService;
	
	//임시데이터 등록하기
	public String insertTemp(TempCrudVO vo) throws Exception{
		String id = idgenService.getNextStringId();
		vo.setCrudId(id);
		tempCrudDAO.insertTemp(vo);
			
		return id;
 	}
	
	//CRUD 목록 가져오기
	public List<EgovMap> selectTempCrudList(TempCrudVO vo) throws Exception {
		return tempCrudDAO.selectTempList(vo);
	}
	
	//CRUD 목록 수
	public int selectTempCrudListCnt(TempCrudVO vo) throws Exception{
		return tempCrudDAO.selectTempListCnt(vo);
	}
	
	//임시데이터 상세
	public TempCrudVO selectTemp(TempCrudVO vo) throws Exception{
		return tempCrudDAO.selectTemp(vo); 
	}
	
	//임시데이터 수정하기
	public void updateTemp(TempCrudVO vo) throws Exception{
		tempCrudDAO.updateTemp(vo);
	}
	
	//임시데이터 삭제하기
	public void deleteTemp(TempCrudVO vo) throws Exception{
		tempCrudDAO.deleteTemp(vo);
	}

	@Override
	public String getNextStringId() {
		// TODO Auto-generated method stub
		return null;
	}
	
}