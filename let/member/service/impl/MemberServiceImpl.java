package egovframework.let.member.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.springframework.stereotype.Service;

import egovframework.let.member.service.MemberService;
import egovframework.let.member.service.MemberVO;
import egovframework.let.utl.sim.service.EgovFileScrty;

@Service("memberService")
public class MemberServiceImpl extends EgovAbstractServiceImpl implements MemberService{

	@Resource(name="memberDAO")
	private MemberDAO memberDAO;
	
	//회원 ID 찾기
	public MemberVO findId(MemberVO vo) throws Exception{
		return memberDAO.findId(vo);
	}

	//회원 비밀번호 찾기
	public MemberVO findPassword(MemberVO vo) throws Exception {
		return memberDAO.findPassword(vo);
	}

	//회원 비밀번호 업데이트
	public void passwordUpdate(MemberVO vo) throws Exception {
		// 입력한 비밀번호 암호화
		String enpassword = EgovFileScrty.encryptPassword(vo.getPassword(), vo.getEsntlId());
		vo.setPassword(enpassword);
	}
	
	//회원목록
	public List<EgovMap> selectMberList(MemberVO vo) throws Exception{
		return memberDAO.selectMberList(vo);
	}
	
	//회원목록수
	@Override
	public int selectMberListCnt(MemberVO vo) throws Exception {
		return memberDAO.selectMberListCnt(vo);
	}

	//회원상세
	@Override
	public EgovMap selectMber(MemberVO vo) throws Exception {
		return memberDAO.selectMber(vo);
	}
}
