package com.spring.demo.SpringCoreConcept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreConceptApplication {

	public static void main(String[] args) {

		BinarySearchImpl binarysearch = new BinarySearchImpl();
		int result = binarysearch.binarySearch(new int[] {12,4,6},3);
		System.out.println(result);

		SpringApplication.run(SpringCoreConceptApplication.class, args);
	}

}
