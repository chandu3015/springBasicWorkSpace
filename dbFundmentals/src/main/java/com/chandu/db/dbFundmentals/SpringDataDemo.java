package com.chandu.db.dbFundmentals;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.chandu.db.dbFundmentals.dao.SpringDataRepository;
import com.chandu.db.dbFundmentals.dao.UserRepository;
import com.chandu.db.dbFundmentals.entity.User;

@SpringBootApplication
public class SpringDataDemo implements CommandLineRunner{

	
	@Autowired
	SpringDataRepository userRepo;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringDataDemo.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
System.out.println("Geeting user by ID 2000 is "+userRepo.findById(2000));
		
		System.out.println("insert user  "+userRepo.save(new User("Yashu","Austin",new Date())).getName());
		
		System.out.println("Update user  "+userRepo.save(new User(1,"Yashovardan","Any State",new Date())).getName());
		
		System.out.println("Delete user  :");
		userRepo.deleteById(1000);
		
		System.out.println("Retrieve all users :");
		List<User> users = userRepo.findAll();
		
		Iterator<User> ul = users.iterator();
		
		while(ul.hasNext())
		{
			System.out.println("User list has: "+ul.next().getName());
		}
		
	}

}