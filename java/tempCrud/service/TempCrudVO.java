package egovframework.let.tempCrud.service;

import java.io.Serializable;

import egovframework.com.cmm.ComDefaultVO;

public class TempCrudVO extends ComDefaultVO implements Serializable {
	
	//작성일
	private java.util.Date frstRegistPnttm;
	
	private java.util.Date getFrstRegistPnttm(){
		return frstRegistPnttm;
	}
	
	private void setFrstRegistPnttm(java.util.Date frstRegistPnttm){
		this.frstRegistPnttm = frstRegistPnttm;
	}
	
	//임시데이터ID
	private String crudId;
	
	//임시데이터값
	private String crudCtgry;

	public String getcrudId() {
		return crudId;
	}

	public void setCrudId(String crudId) {
		this.crudId = crudId;
	}

	public String getcrudCtgry() {
		return crudCtgry;
	}

	public void setcrudCtgry(String crudCtgry) {
		this.crudCtgry = crudCtgry;
	}
	
}