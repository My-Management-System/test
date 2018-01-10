package com.my.nine;
import java.util.*;
public class Apple<T extends Number> {
	/*private T info ;
	public Apple(){}
	public Apple(T info){
		this.info = info;
	}
	public void setInfo(T info){
		this.info = info;
	}
	public T getInfo(){
		return info;
	}
	
	*/
	 T size;
	 public Apple(){
		 
	 }
	 public Apple(T size){
		 this.size = size;
	 }
	 public void setSize(T size){
		 this.size = size;
	 }
	 public T getSize(){
		 return this.size;
	 }
	

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
		Apple<String> app = new Apple<>("pingguo");
		Apple<Double> app2 = new Apple<>(5.6);
		System.out.println(app.getInfo()+" "+app2.getInfo());*/
		/*Apple<Integer> ai = new Apple<>();
		Apple<Double> ad = new Apple<>();*/
		/*Apple<Integer> ai  = new Apple<>(6);
		Integer as = ai.getSize();
		Apple b = ai;
		Number size1 = b.getSize();
		//Integer size2 = b.getSize();
		
		System.out.println(ai.getSize());*/
		
		//List<String>[] lsa = new List<String>[10];
		
		
		
	}

}
/*class A extends Apple{
	public String getInfo(){
		//return "zilei "+super.getInfo();
		return super.getInfo().toString();
	}
	
	 
}*/
