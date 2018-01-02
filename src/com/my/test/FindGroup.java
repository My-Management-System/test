package com.my.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindGroup {
	public static void main(String[] args)
	{
		String str = "java ����ѧϰ ��ϵ�绰��13523900099"
					 +"��Ҫ��Ʊ�����绰 15690992233"
					 +"�ⷿ �绰 13459092222";
		Matcher m = Pattern.compile("((13\\d)|(15\\d))\\d{8}").matcher(str);
		while(m.find())
		{
			System.out.println(m.group());	
		} 
		startend();
		matchertest();
		replacetest();
	}
	public static void startend()
	{
		String str = "java is easy";
		Matcher m = Pattern.compile("\\w+").matcher(str);
		while(m.find())
		{
			
			System.out.println(m.group()+"   "+m.start()+"  "+m.end());
		}
	}
	public static void matchertest()
	{
		String[] mails={"xuxiaofen@163.com",
						"gongleihello@gmail.com",
						"gongyi@abc.org",
						"xiaofenxu@345.xxx",
						"xiaofen.com"
		               };
		String regs = "\\w{3,20}@\\w+\\.(org|com|gov)";
		Pattern pattern = Pattern.compile(regs);
		Matcher matcher = null;
		for(String mail:mails)
		{
			if(matcher==null)
			{
				matcher = pattern.matcher(mail);
				
			}else
			{
				
				matcher.reset(mail);
			}
			String result = mail+(matcher.matches()?"��":"����")+"һ����Ч�ĵ�ַ";
			System.out.println(result);
			
		}
		
	}
	
	public static void replacetest()
	{
		String[] args = {"java has regler and excrexiong",
						 "relace hhelio salfjd dd",
						 "adfa dsal relandadd"};
		Pattern pat = Pattern.compile("re\\w*");
		Matcher mat = null;
		for(int i=0;i<args.length;i++)
		{
			if(mat == null)
			{
				mat = pat.matcher(args[i]);
			}else
			{
				mat.reset(args[i]);
			}
			System.out.println(mat.replaceAll("�Ǻ�"));
		}
		
	}
}
