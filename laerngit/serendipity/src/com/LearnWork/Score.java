package com.LearnWork;
import java.util.*;
public class Score {
	public static double avg(double[] array) {
		int sum=0;
		for(double a:array) {
			sum+=a;
		}
		int avgs=sum/array.length;
			
		return avgs;
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
         String[] name= new String[]{"语文","数学","英语","物理","化学"}; 
         double[] scores=new double[name.length];
            for (int i=0, a=name.length;i<a;i++) {
            	System.out.printf("请输入%s的成绩：\n",name[i]);
            	   double score=in.nextDouble();
            	   if(score>100||score<0) {
            		   do {
            		   System.out.println("请输入正确成绩（满分100分）");
            		   score=in.nextDouble();
            		   }while(score>100||score<0);
            	}	   
            	     scores[i]=score;	 
            	}     	 
            	 
            	  double avgs=avg(scores);    	
            	    
            	System.out.println("各科平均分为："+avgs);	   
            		
      }      	
            	
  }            
           
            
             
            
           
        	


