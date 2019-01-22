package com.chandu.db.dbFundmentals.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.chandu.db.dbFundmentals.entity.Person;

public class PersonRowMapper implements RowMapper<Person> {

	@Override
	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Person p = new Person();
		p.setId(rs.getInt("ID"));
		p.setLocation(rs.getString("Location"));
		p.setName(rs.getString("NAME"));
		p.setDob(rs.getDate("birth_date"));
		
		return p;
	}

}
