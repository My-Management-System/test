package com.my.ten;

public class DivTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int a = 6;
			int b = 2;
			int c = a/b;
			System.out.println("您输入的两个数相除的结果是："+c);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("数组越界");
		}catch(NumberFormatException e){
			System.out.println("数字格式异常");
		}catch(Exception e){
			System.out.println("未知异常");
		}
	}

}
