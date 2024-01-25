package com.dao;

public class Student {
	
	private Integer sid;
	private  String sName;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(Integer sid, String sName) {
		super();
		this.sid = sid;
		this.sName = sName;
	}

	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + "]";
	}
	
	
	

}
