package com.rentcar;
import java.util.*;
public class main {
    //����car���������������������Ϣ
	public static Car[] cars= {
    		new PassengerCar("�µ�A6L",800,4),
    		new PassengerCar("����3ϵ",750,4),
    		new PassengerCar("������",600,4),
    		new Turk("��ά��",1000,17),
    		new Turk("������",500,10),
    		new PickUP("����Ƥ��",600,4,2),
    		new PickUP("����Ƥ��",800,4,3),
    };
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
    	 Scanner scanner= new Scanner(System.in);
    	 
    	 System.out.printf("��ӭʹ���⳵ϵͳ��%n@@@@�Ƿ���Ҫ�⳵�� 1����    2����");
    	 int in=scanner.nextInt();
    	 if(in==1) {
    		 System.out.println("�����ǳ�����Ϣ�ͼ�Ŀ��/n");
    		 System.out.println("���\t����\t���\t�ؿ��ػ���");
    		 for(int i=0,a=cars.length;i<a;i++) {
    			 System.out.printf("%d.\t%s\t\t%dԪ/��\t%s%n",i+1,cars[i].getName(),cars[i].getPrice(),cars[i].getType());
    		 }
               // �������¼ѡ�����Ƕ�̬���飬��car[]��̬����һ��ͬ����������ͬ���ԡ�  		   
    		 //��������ʽӦ�������������е�����Ϣ�Ĳ�����������������飬����ȷ����ֻ��Ԫ��ֵ�ı�����������ȿ��Ա仯��
    		 //������ȿ��Ա仯,��
    		 int im[]=new int [cars.length];
    		     int affirm=0;   
    		       do {
    		        System.out.println("@@@@��������Ҫ�⳵����(�������)��");
    		    
    		        int type=scanner.nextInt();
    		        if(type>cars.length+1) {
    		        	System.out.println("@@@�����������⳵���ͣ�");
    		        	type=scanner.nextInt();
    		        }
    		        System.out.println("@@@@��������Ҫ�⳵������");
    		        int num=scanner.nextInt();
    		        im[type-1]=num;//��������im��¼�⳵���������±�ͬ����һһ��Ӧ
    		        System.out.print("@@@@�Ƿ�ȷ�����룺   1��ȷ��   2������ѡ��");
    		         affirm=scanner.nextInt();
    	     }  while(affirm==1);    
    		        
    	            System.out.println("�������⳵������");
    		        int day=scanner.nextInt();
    	            
    		        System.out.println("����������ͳ�ƺ��˵���");
    		        
    		        System.out.println("���������������˵ĳ��У�");
    		        int passengerNum=0;
    		        for(int i=0,a=im.length;i<a;i++ ) {
    		        	//ɸѡ�������������ԵĶ��󣬱��������ֵ
    		        	if(im[i]!=0 && cars[i]instanceof Ipassenger) {
    		        		System.out.printf("%s*%d",cars[i].getName(),im[i] );
    		        		passengerNum+=((Ipassenger) cars[i]).getPassengerNum()*im[i];//ͨ���ӿ�ʹ��������������෽��
    		        	} 
    		        }
    		        System.out.printf("�����ˣ�%d��%n",passengerNum);
    		        
    		        System.out.println("���������������ػ��ĳ��У�");
    		        int cargoNum=0;
    		        for(int i=0,a=im.length;i<a;i++) {
    		        	//ɸѡ�������ػ����ԵĶ��󣬱��������ֵ
    		        	if(im[i]!=0 && cars[i]instanceof Icargo) {
    		        		System.out.printf("%s*%d",cars[i].getName(),im[i]);
    		        		cargoNum+=((Icargo)cars[i]).getCargoWeight()*im[i];
    		        	}
    		        }
    		        System.out.printf("���ػ���%d%n",cargoNum);
    		        
    		        int priceSum=0;//�ҳ��۸����ԣ��������
    		        for(int i=0,a=im.length;i<a;i++) {
    		        	if(im[i]!=0) {
    		        		priceSum+=cars[i].getPrice()*im[i];
    		        	}
    		        }
    		        System.out.printf("�������������⳵�ܼ�%dԪ%n",priceSum);	
    		        System.out.println("��л���ʹ�ã���");
    		    }
    			 
    		// }else {System.out.println("��л��Ĺ��٣���");}
    	        scanner.close();
     }
}

//}
