package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("jdbc_dao") //store data in DB
public class jdbcStudentDAO implements StudentDAO {
	@Autowired
	DataSource ds;
	@Override
	public int createData(Student s) {
		// TODO Auto-generated method stub
		int row=0;
		try {
		Connection conn=ds.getConnection();
		PreparedStatement prp=conn.prepareStatement("insert into student values(?,?)");
		
		prp.setInt(1,s.getSid());
		prp.setString(2,s.getsName());
		
		row=prp.executeUpdate();
		
	}
	catch (SQLException e) {
		e.printStackTrace();
	}
		return row;
	}

}
