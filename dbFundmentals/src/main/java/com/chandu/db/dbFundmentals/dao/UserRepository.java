package com.chandu.db.dbFundmentals.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.chandu.db.dbFundmentals.entity.User;

@Repository
@Transactional
public class UserRepository {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public User findById(int id)
	{
		return entityManager.find(User.class, id);
	}
	
	public User updateAndInsert(User u)
	{
		return entityManager.merge(u);
	}
	
	public void deleteById(int id)
	{
		User u = findById(id);
		entityManager.remove(u);
	}

	
	//using named querry
	public List<User> findAll()
	{
		TypedQuery<User> namedQuerry = entityManager.createNamedQuery("retrive_ALL_User",User.class);
		return namedQuerry.getResultList();
	}
}