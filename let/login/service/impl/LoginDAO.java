package egovframework.let.login.service.impl;

import org.egovframe.rte.psl.dataaccess.EgovAbstractMapper;
import org.springframework.stereotype.Repository;

import egovframework.com.cmm.LoginVO;

@Repository("egovLoginDAO")
public class LoginDAO extends EgovAbstractMapper {
	
	//일반 로그인을 처리한다
  	public LoginVO actionLogin(LoginVO vo) throws Exception{
  		return selectOne("egovLoginDAO.actionLogin", vo);
  	}
	
}