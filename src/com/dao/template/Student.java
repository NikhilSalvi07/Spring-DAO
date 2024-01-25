package com.dao.template;

public class Student {
	private int sid;
	private String sName;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sName) {
		super();
		this.sid = sid;
		this.sName = sName;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
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
