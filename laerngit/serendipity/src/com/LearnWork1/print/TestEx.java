package com.LearnWork1.print;

import java.util.Scanner;

public class TestEx {
	public static void main(String[] args) {
		System.out.println("请输入课程代码（1——3）");
		Scanner in=new Scanner(System.in);
		try{
			int a=in.nextInt();
			switch(a) {
				case 1:
					System.out.println("汇编语言");
					break;
				case 2:
					System.out.println("计算机基础");
					break;
				case 3:
					System.out.println("大学物理");
					break;
			}
		    }catch(Exception ex) {
		    	System.out.println("请输入正确编号（1——3）！！");
		    	ex.printStackTrace();
		    }finally {
		    	System.out.println("欢迎你的使用！！");
		    	 in.close();
			}
		   
		
			
	}
}
