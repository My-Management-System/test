package com.my.nine;

 import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ErrorTest {
	
	static <T> void test(Collection<? extends T> from,Collection<T> to){
		for(T ele:from){
			to.add(ele);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List<Object> lo = new ArrayList<>();
		List<String> ls = new ArrayList<>();
		test(ls,lo);*/
		
		new Foo("fengkuang java");
		new Foo(200);
		new <String> Foo("helloworld");
		//new <String> Foo(12.3);
		
		MyClass<String> mc1 = new  MyClass<>(5);
		MyClass<String> mc2 = new<Integer>   MyClass<String>(5);
		//MyClass<Integer> mc3 = new<Integer>   MyClass<>(5);
		
	}

}
class Foo{
	
	public <T> Foo(T t){
		System.out.println(t);
	}
}
class MyClass<E>{
	public <T> MyClass(T t){
		System.out.println(t);
	}
}
 
