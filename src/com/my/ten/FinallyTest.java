package com.my.ten;

public class FinallyTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 throwCheked(1); 
		 try{
			
		 }catch(Exception e){
			 System.out.println(e.getMessage());
		 } 
		 throwRuntime(3);
		 
	}
	public static void throwCheked(int a) throws Exception{ 
		if(a>0){
			throw new Exception("a不能大于0");
		}
	}
	public static void throwRuntime(int a){
		if(a>0){
			throw new RuntimeException("a不能大于0啊");
		}
	}
}