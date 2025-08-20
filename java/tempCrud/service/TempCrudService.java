package egovframework.let.tempCrud.service;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.springframework.stereotype.Service;

@Service
public interface TempCrudService {
	
	//임시데이터 가져오기
	public TempCrudVO selectTemp(TempCrudVO vo) throws Exception;
	
	//임시데이터 등록하기
	public String insertTemp(TempCrudVO vo) throws Exception;
	
	//임시데이터 목록 가져오기
	public List<EgovMap> selectTempCrudList(TempCrudVO vo) throws Exception;
	
	//임시데이터 목록 수
	public int selectTempCrudListCnt(TempCrudVO vo) throws Exception;
	
	//임시데이터 수정하기
	public void updateTemp(TempCrudVO vo) throws Exception;
		
	//임시데이터 삭제하기
	public void deleteTemp(TempCrudVO vo) throws Exception;

	public String getNextStringId();
}