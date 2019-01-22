package com.chandu.spring.basics.springBasicArtifact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.chandu.spring.basics.springBasicArtifact.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringBasicArtifactApplicationBasic {

	public static void main(String[] args) {
		ApplicationContext applicationContext =  SpringApplication.run(SpringBasicArtifactApplicationBasic.class, args);
		
		
		/*
		SortAlg sortAlg = new QuickSortAlg();
		
		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(sortAlg);
		binarySearchImpl.binarySearch(new int[] {12,45,33}, 5);
		*/
		
		
		BinarySearchImpl binarySearchImpl= applicationContext.getBean(BinarySearchImpl.class);
		binarySearchImpl.binarySearch(new int[] {12,45,33}, 5);
		
	}

}

