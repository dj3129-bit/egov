package egovframework.let.tempCrud.service.impl;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.EgovAbstractMapper;
import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.springframework.stereotype.Repository;

import egovframework.let.tempCrud.service.TempCrudVO;

@Repository("tempCrudDAO")
public class TempCrudDAO extends EgovAbstractMapper{
	
	//임시데이터 등록
	public void insertTemp(TempCrudVO vo) throws Exception{
		insert("tempCrudDAO.insertTemp", vo);
	}

	//임시데이터 가져오기
	public TempCrudVO selectTemp(TempCrudVO vo) throws Exception {
		return selectOne("tempCrudDAO.selectTemp",vo);
	}
	
	//임시데이터 목록 가져오기
	public List<EgovMap> selectTempList(TempCrudVO vo) throws Exception {
		return selectList("tempCrudDAO.selectTempList", vo);
	}
	
	//임시데이터 목록 수
	public int selectTempListCnt(TempCrudVO vo) throws Exception{
		return selectOne("tempCrudDAO.selectTempListCnt", vo);
	}
	
	//임시데이터 수정
	public void updateTemp(TempCrudVO vo) throws Exception{
		update("tempCrudDAO.updateTemp", vo);
	}
	
	//임시데이터 삭제
	public void deleteTemp(TempCrudVO vo) throws Exception{
		delete("tempCrudDAO.deleteTemp", vo);
	}
}