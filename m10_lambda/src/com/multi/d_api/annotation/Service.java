package com.multi.d_api.annotation;



public class Service {

	@PrintAnnotation(value = "*", number = 10)
	public void printStar() {
		System.out.println("*****");
	}

}
