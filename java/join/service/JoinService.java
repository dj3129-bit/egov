package egovframework.let.join.service;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.util.EgovMap;

public interface JoinService {
	
	//아이디 공백체크
	public int duplicateCheck(JoinVO vo) throws Exception;
}
