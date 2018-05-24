package com.LearnWork;
import java.util.*;
 class Query{
	ArrayList<String> course =new ArrayList<String>();//课程list
	int[] nums=new int[60];//编号数组 int nums= new int[course.size()]
    int num;//查询号码
	public String query(){
    	
		for(int i=0,a=course.size();i<=a;i++) {
			
			if(nums[i]==num) {
				return course.get(i);
			}
			
		}
		
		
		
		/*for(int a:nums) {
    		int i=0;
    		i++;
			if(a==num) {
    		return course.get(i);	
    		} 
    	     
		}*/
    	return "查询无结果";
    	
    }


}



public class Dict{
	public static void main(String[] args) {
		Query d=new Query();
		Scanner inInt=new Scanner(System.in);
	    Scanner inString=new Scanner(System.in);
		int end=0;  
		int i=0; 
	    do {	
	    	
	   
	    	System.out.println("请输入课程名称：");
	    	String name=inString.nextLine();
	    	d.course.add(name);  
	        
	    	System.out.println("请输入此课程编号：");
	        int number=inInt.nextInt();
	    	
	        d.nums[i]=number;
	        i++; 
	        
	        System.out.println("按‘1’可结束输入,按任意数字继续录入");
	        end=inInt.nextInt();
	        
	    }while(!(end==1));
	      
		System.out.println("请输入需要查询的课程编号：");
		d.num=inInt.nextInt();
		System.out.println(d.query());
		inInt.close();
		inString.close();
		
	}
}
