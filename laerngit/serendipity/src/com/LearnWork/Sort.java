package com.LearnWork;
import java.util.*;

public class Sort {
    //从小到大排序
	public static void minPrint(int[] array) {
    	int length=array.length;
		boolean flag=true;
    	for(int i=0;i<length&&flag;i++) {
    		flag=false;
    		for(int j=length-1;j>i;j--) {
    			if(array[i]>array[j]) {
    				int a=array[i];
    				array[i]=array[j];
    				array[j]=a;
    			    flag=true;
    			}
    		}
    	}
    		System.out.println(array[0]);
    		
    }
	
	
	
	public static void main(String[] args) {
    	int[] prices=new int[4];
    	Scanner scanner=new Scanner(System.in);
    	for(int i=0;i<4;i++) {
    		System.out.printf("请输入第%d个手机价格：\n",i+1);
    		int price=scanner.nextInt();
    		prices[i]=price;
    	}
	     System.out.println("最低价格为：");
	     minPrint(prices);
	}
}
