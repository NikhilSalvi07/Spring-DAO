package com.dao.template;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository("sdao")
public class StudentJdbcTemplate implements StudentDAO {
	
	@Autowired
	JdbcTemplate jt;
	@Override
	public int createData(Student s) {
		// TODO Auto-generated method stub
		//return 0;
		return jt.update("insert into student values(?,?)",s.getSid(),s.getsName());
	}

	@Override
	public Student retrById(int id) {
		// TODO Auto-generated method stub
		//return null;
		return jt.queryForObject("select * from student where sid=?",BeanPropertyRowMapper.newInstance(Student.class),id);
	}

	@Override
	public List<Student> retrAll() {
		// TODO Auto-generated method stub
		//return null;
		//N numbers of record added
		return jt.query("select * from student",BeanPropertyRowMapper.newInstance(Student.class));
	}

}
