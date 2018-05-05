package com.rentcar;
import java.util.*;
public class main {
    //创建car类的数组容纳所有子类信息
	public static Car[] cars= {
    		new PassengerCar("奥迪A6L",800,4),
    		new PassengerCar("宝马3系",750,4),
    		new PassengerCar("帕萨特",600,4),
    		new Turk("依维柯",1000,17),
    		new Turk("五菱宏光",500,10),
    		new PickUP("福特皮卡",600,4,2),
    		new PickUP("进口皮卡",800,4,3),
    };
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
    	 Scanner scanner= new Scanner(System.in);
    	 
    	 System.out.printf("欢迎使用租车系统：%n@@@@是否需要租车： 1：是    2：否");
    	 int in=scanner.nextInt();
    	 if(in==1) {
    		 System.out.println("以下是车辆信息和价目表：/n");
    		 System.out.println("序号\t名称\t租金\t载客载货量");
    		 for(int i=0,a=cars.length;i<a;i++) {
    			 System.out.printf("%d.\t%s\t\t%d元/天\t%s%n",i+1,cars[i].getName(),cars[i].getPrice(),cars[i].getType());
    		 }
               // 此数组记录选择像是动态数组，与car[]静态数组一起共同描述各类相同属性。  		   
    		 //此描述方式应该能适用于所有单类信息的操作；但利用这个数组，长度确定，只有元素值的变量，如果长度可以变化，
    		 //如果长度可以变化,设
    		 int im[]=new int [cars.length];
    		     int affirm=0;   
    		       do {
    		        System.out.println("@@@@请输入需要租车类型(输入序号)：");
    		    
    		        int type=scanner.nextInt();
    		        if(type>cars.length+1) {
    		        	System.out.println("@@@请重新输入租车类型：");
    		        	type=scanner.nextInt();
    		        }
    		        System.out.println("@@@@请输入需要租车数量：");
    		        int num=scanner.nextInt();
    		        im[type-1]=num;//利用数组im记录租车数量，其下标同车型一一对应
    		        System.out.print("@@@@是否确认输入：   1：确认   2：继续选择");
    		         affirm=scanner.nextInt();
    	     }  while(affirm==1);    
    		        
    	            System.out.println("请输入租车天数：");
    		        int day=scanner.nextInt();
    	            
    		        System.out.println("下面是您的统计和账单：");
    		        
    		        System.out.println("—————可载人的车有：");
    		        int passengerNum=0;
    		        for(int i=0,a=im.length;i<a;i++ ) {
    		        	//筛选出符合载人属性的对象，遍历计算和值
    		        	if(im[i]!=0 && cars[i]instanceof Ipassenger) {
    		        		System.out.printf("%s*%d",cars[i].getName(),im[i] );
    		        		passengerNum+=((Ipassenger) cars[i]).getPassengerNum()*im[i];//通过接口使父类对象引用子类方法
    		        	} 
    		        }
    		        System.out.printf("共载人：%d人%n",passengerNum);
    		        
    		        System.out.println("——————可载货的车有：");
    		        int cargoNum=0;
    		        for(int i=0,a=im.length;i<a;i++) {
    		        	//筛选出符合载货属性的对象，遍历计算和值
    		        	if(im[i]!=0 && cars[i]instanceof Icargo) {
    		        		System.out.printf("%s*%d",cars[i].getName(),im[i]);
    		        		cargoNum+=((Icargo)cars[i]).getCargoWeight()*im[i];
    		        	}
    		        }
    		        System.out.printf("共载货：%d%n",cargoNum);
    		        
    		        int priceSum=0;//找出价格属性，遍历求和
    		        for(int i=0,a=im.length;i<a;i++) {
    		        	if(im[i]!=0) {
    		        		priceSum+=cars[i].getPrice()*im[i];
    		        	}
    		        }
    		        System.out.printf("——————租车总价%d元%n",priceSum);	
    		        System.out.println("感谢你的使用！！");
    		    }
    			 
    		// }else {System.out.println("感谢你的光临！！");}
    	        scanner.close();
     }
}

//}
