package com.dao.template;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.template.Student;



public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	    StudentDAO sd=ctx.getBean("sdao",StudentJdbcTemplate.class);
	  
	    Student s=new Student(23,"raj");
	    sd.createData(s);
	    System.out.println(sd.retrById(11));
	    System.out.println(sd.retrAll());
	    


	}

}
