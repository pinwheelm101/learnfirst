package com.LearnWork;
import java.util.*;
 class Query{
	ArrayList<String> course =new ArrayList<String>();//课程list
	int[] nums=new int[60];//编号数组
    int num;//查询号码
	public String query(int[] nums,ArrayList<String> course){
    	
		for(int a:nums) {
    		int i=0;
    		
			if(a==num) {
    		return course.get(i);	
    		} 
    	     i+=1;
		}
    	return "查询无结果";
    	
    }


}



public class Dict{
	public static void main(String[] args) {
		Query d=new Query();
		Scanner in=new Scanner(System.in);
	    int end=0;  
		do {
	    	
	    	int i=0;
	    	System.out.println("请输入课程名称：");
	    	d.course.add(in.nextLine());  
	        
	    	System.out.println("请输入此课程编号：");
	        d.nums[i]=in.nextInt();
	        i+=1;
	        
	        System.out.println("按‘1’可结束输入\n");
	        end=in.nextInt();
	        
	    }while(!(end==1));
	      
		System.out.println("请输入需要查询的课程编号：");
		d.num=in.nextInt();
		System.out.println(d.query(d.nums, d.course));
	    in.close();
	}
}
