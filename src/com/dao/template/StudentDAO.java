package com.dao.template;

import java.util.List;

public interface StudentDAO {
	
	int createData(Student s);
	Student retrById(int id);
	List<Student> retrAll();

}
