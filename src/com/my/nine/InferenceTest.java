package com.my.nine;

public class InferenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil<String> ls = MyUtil.nil();
		MyUtil<String> mu = MyUtil.<String>nil();
		MyUtil.cons(42, MyUtil.nil());
		
	}

}
class MyUtil<E>{
	
	public static <Z> MyUtil<Z> nil(){
		return null;
	}
	public static <Z> MyUtil<Z> cons(Z head,MyUtil<Z> tail){
		return null;
	}
	E head(){
		return null;
	}
}
