package egovframework.let.board.service;

import java.io.Serializable;

import egovframework.com.cmm.ComDefaultVO;

public class BoardVO extends ComDefaultVO implements Serializable {
	
	//게시판ID
	private String boardId;
	//게시판명
	private String boardSj;
	//게시판 내용
	private String boardCn;
	//조회수
	private String inqireCn;
	//등록자IP
	private String inqireCo;
	
	private String creatIp;
	//공지여부
	private String noticeAt;
	//비공개여부
	private String othbcAt;
	//사용여부
	private String useAt;
	//첨부파일ID
	private String atchFileId;
	//최초등록시점
	private java.util.Date frstRegistPnttm;
	//최초등록자ID
	private String frstRegisterId;
	//최종수정시점
	private java.util.Date lastUpdtPnttm;
	//최종수정자ID
	private String lastUpdateId;
	//사용자ID
	private String userId;
	//관리자여부
	private String mngAt;
	//게시물타입
	public String boardType;
	
	public String getBoardId() {
		return boardId;
	}
	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}
	public String getBoardSj() {
		return boardSj;
	}
	public void setBoardSj(String boardSj) {
		this.boardSj = boardSj;
	}
	public String getBoardCn() {
		return boardCn;
	}
	public void setBoardCn(String boardCn) {
		this.boardCn = boardCn;
	}
	public String getInqireCn() {
		return inqireCn;
	}
	public void setInqireCn(String inqireCn) {
		this.inqireCn = inqireCn;
	}
	public String getCreatIp() {
		return creatIp;
	}
	public void setCreatIp(String creatIp) {
		this.creatIp = creatIp;
	}
	public String getNoticeAt() {
		return noticeAt;
	}
	public void setNoticeAt(String noticeAt) {
		this.noticeAt = noticeAt;
	}
	public String getOthbcAt() {
		return othbcAt;
	}
	public void setOthbcAt(String othbcAt) {
		this.othbcAt = othbcAt;
	}
	public String getUseAt() {
		return useAt;
	}
	public void setUseAt(String useAt) {
		this.useAt = useAt;
	}
	public String getAtchFileId() {
		return atchFileId;
	}
	public void setAtchFileId(String atchFileId) {
		this.atchFileId = atchFileId;
	}
	public java.util.Date getFrstRegistPnttm() {
		return frstRegistPnttm;
	}
	public void setFrstRegistPnttm(java.util.Date frstRegistPnttm) {
		this.frstRegistPnttm = frstRegistPnttm;
	}
	public String getFrstRegisterId() {
		return frstRegisterId;
	}
	public void setFrstRegisterId(String frstRegisterId) {
		this.frstRegisterId = frstRegisterId;
	}
	public java.util.Date getLastUpdtPnttm() {
		return lastUpdtPnttm;
	}
	public void setLastUpdtPnttm(java.util.Date lastUpdtPnttm) {
		this.lastUpdtPnttm = lastUpdtPnttm;
	}
	public String getLastUpdateId() {
		return lastUpdateId;
	}
	public void setLastUpdateId(String lastUpdateId) {
		this.lastUpdateId = lastUpdateId;
	}
	public String getUserId() {
		return userId;
	}
	public String getInqireCo() {
		return inqireCo;
	}
	public void setInqireCo(String inqireCo) {
		this.inqireCo = inqireCo;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMngAt() {
		return mngAt;
	}
	public void setMngAt(String mngAt) {
		this.mngAt = mngAt;
	}
	public String getBoardType() {
		return boardType;
	}
	public void setBoardType(String boardType) {
		this.boardType = boardType;
	}
}
