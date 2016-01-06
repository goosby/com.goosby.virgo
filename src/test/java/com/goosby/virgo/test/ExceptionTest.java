package com.goosby.virgo.test;

public class ExceptionTest {
	
	public static void main(String[] args){
		ExceptionTest test = new ExceptionTest();
		test.test1();
		test.test2();
		test.test3();
	}
	
	public void test1(){
		System.out.println("1");
	}
	
	public void test2() {
//		System.out.println(1/0);
		throw new RuntimeException();
	}
	public void test3(){
		System.out.println("3");
	}
}
