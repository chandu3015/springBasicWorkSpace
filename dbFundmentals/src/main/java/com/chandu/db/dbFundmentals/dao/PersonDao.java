package com.chandu.db.dbFundmentals.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.chandu.db.dbFundmentals.entity.Person;

@Repository
public class PersonDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	PersonRowMapper personRowMapper = new PersonRowMapper();
	
	public List<Person> findAll()
	{
		String sql="select * from person";
		BeanPropertyRowMapper rse = new BeanPropertyRowMapper<Person>(Person.class);
		
		//return jdbcTemplate.query(sql, rse);
		return jdbcTemplate.query(sql, personRowMapper);
		
	}
	
	public Person findbyId(int id)
	{
		
		String sql="select * from person where id = ?";
		
		
		//Person p = jdbcTemplate.queryForObject(sql, new Object[] {id}, new BeanPropertyRowMapper<Person>(Person.class));
		

		Person p = jdbcTemplate.queryForObject(sql, new Object[] {id}, personRowMapper);
		
		return p;
	}
	
	public int deleteById(int id)
	{
		
		String sql="delete from person where id = ?";
		
		
		return  jdbcTemplate.update(sql, new Object[] {id});
		
		
	}
	
	public int insert(Person p)
	{
		
		String sql="insert  into person values (? , ?, ?, ?)";
		
		
		return  jdbcTemplate.update(sql, new Object[] {p.getId(),p.getName(),p.getLocation(),p.getDob()});
		
		
	}
	
	public int update(Person p)
	{
		
		String sql="update person set  name = ? ,  location = ? , birth_date = ? where id = ?";
		
		
		return  jdbcTemplate.update(sql, new Object[] {p.getName(),p.getLocation(),p.getDob(),p.getId()});
		
		
	}
	
	

}