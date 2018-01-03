package com.my.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
	public static void main(String[] args){
		
		double db = 12340000.57;
		Locale[] locale = {Locale.CHINA,Locale.JAPAN,Locale.GERMAN,Locale.US};
		NumberFormat[] nf = new NumberFormat[12];
		for(int i=0;i<locale.length;i++)
		{
			nf[i*3] = NumberFormat.getNumberInstance(locale[i]);
			nf[i*3+1] = NumberFormat.getPercentInstance(locale[i]);
			nf[i*3+2] = NumberFormat.getCurrencyInstance(locale[i]);
		}
		for(int i=0;i<locale.length;i++)
		{
			String tip = i==0?"---�й���ʽ---":
						 i==1?"---�ձ���ʽ---":
						 i==2?"---�¹���ʽ---":"---������ʽ---" ;
						
			System.out.println(tip);
			System.out.println("ͨ����ֵ��ʽ��"+nf[i*3].format(db));
			System.out.println("�ٷֱȸ�ʽ��"+nf[i*3+1].format(db));
			System.out.println("������ֵ��ʽ��"+nf[i*3+2].format(db));
			
			
		}
		
	}

}
