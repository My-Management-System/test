package com.my.ten;

public class DivTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int a = 6;
			int b = 2;
			int c = a/b;
			System.out.println("�����������������Ľ���ǣ�"+c);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("����Խ��");
		}catch(NumberFormatException e){
			System.out.println("���ָ�ʽ�쳣");
		}catch(Exception e){
			System.out.println("δ֪�쳣");
		}
	}

}
