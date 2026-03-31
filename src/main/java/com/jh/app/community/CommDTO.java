package com.jh.app.community;

import java.sql.Date;

public class CommDTO {
	
	private Integer commNum;
	private String commTitle;
	private String commName;
	private String commContents;
	private Date commTime;
	private Integer commStar;
	
	
	public Integer getCommNum() {
		return commNum;
	}
	public void setCommNum(Integer commNum) {
		this.commNum = commNum;
	}
	public String getCommTitle() {
		return commTitle;
	}
	public void setCommTitle(String commTitle) {
		this.commTitle = commTitle;
	}
	public String getCommName() {
		return commName;
	}
	public void setCommName(String commName) {
		this.commName = commName;
	}
	public String getCommContents() {
		return commContents;
	}
	public void setCommContents(String commContents) {
		this.commContents = commContents;
	}
	public Date getCommTime() {
		return commTime;
	}
	public void setCommTime(Date commTime) {
		this.commTime = commTime;
	}
	public Integer getCommStar() {
		return commStar;
	}
	public void setCommStar(Integer commStar) {
		this.commStar = commStar;
	}
	
	
}