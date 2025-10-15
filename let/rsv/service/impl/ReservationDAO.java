package egovframework.let.rsv.service.impl;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.EgovAbstractMapper;
import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.springframework.stereotype.Repository;

import egovframework.let.board.service.BoardVO;
import egovframework.let.join.service.JoinVO;
import egovframework.let.member.service.MemberVO;
import egovframework.let.rsv.service.ReservationVO;
import egovframework.let.temp2.service.Temp2VO;

@Repository("reservationDAO")
public class ReservationDAO extends EgovAbstractMapper {
	
	//예약 목록 가져오기
    public List<EgovMap> selectReservationList(ReservationVO vo) throws Exception{
    	return selectList("reservationDAO.selectReservationList", vo);
    }
    
    //예약 목록 수
    public int selectReservationListCnt(ReservationVO vo) throws Exception {
    	return selectOne("reservationDAO.selectReservationListCnt", vo);
    }
    
    //예약 상세정보
	public ReservationVO selectReservation(ReservationVO vo) {
		return selectOne("reservationDAO.selectReservation", vo);
	}

	public void insertReservation(ReservationVO vo) {
		insert("reservationDAO.insertReservation", vo);	
	}

	public void updateReservation(ReservationVO vo) {
		update("reservationDAO.updateReservation", vo);
	}

	public void deleteReservation(ReservationVO vo) {
		delete("reservationDAO.deleteReservation", vo);
	}
}
