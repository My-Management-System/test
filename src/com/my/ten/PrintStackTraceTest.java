package com.my.ten;

public class PrintStackTraceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstMethod();
	}
	public static void firstMethod(){
		lastMethod();
	}
	public static void lastMethod(){
		throw new SelfException("�Զ����쳣");
	}
}
class SelfException extends RuntimeException{
	SelfException(){}
	SelfException(String msg){
		super(msg);
	} 
}