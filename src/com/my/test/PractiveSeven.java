package com.my.test;

import java.util.Arrays;
import java.util.Scanner;

public class PractiveSeven {

	public static void main(String[] args){
	
		String str = "A1B2C3D4E5F6";
 		String[] arrStr = new String[6] ;
		int[]  arr = new int[6];
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0){
				
				arrStr[i/2] =String.valueOf(str.charAt(i));
			}else{
				arr[(i-1)/2] =Character.getNumericValue(str.charAt(i)) ;
			}
		}
		 
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.asList(arrStr));

	}

}
