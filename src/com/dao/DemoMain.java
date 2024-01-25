package com.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	    StudentDAO sd=ctx.getBean("jdbc_dao",jdbcStudentDAO.class);
	   
	    
	    Student s=new Student(5,"ramesh");
	    sd.createData(s);
	   
       
	}

}
