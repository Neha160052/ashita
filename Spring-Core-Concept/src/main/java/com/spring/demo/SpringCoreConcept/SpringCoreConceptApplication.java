package com.spring.demo.SpringCoreConcept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreConceptApplication {

	public static void main(String[] args) {

		// BinarySearchImpl binarysearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		ApplicationContext applicationContext = SpringApplication.run(SpringCoreConceptApplication.class, args);
		BinarySearchImpl binarysearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarysearch.binarySearch(new int[] {12,4,6},3);
		System.out.println(result);

	}

}
