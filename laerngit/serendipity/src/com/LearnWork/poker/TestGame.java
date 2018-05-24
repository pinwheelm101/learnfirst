package com.LearnWork.poker;

import java.util.*;

public class TestGame {
	public static int getId(Scanner sc) {
		int playerId;
		while(true) {
			System.out.println("ID:");
			try {
				playerId=sc.nextInt();
				break;
			}catch(InputMismatchException e) {
				System.out.println("请输入整数型！！");
			}
		}
		
		 return playerId;
	}
	
	public static String getName(Scanner sc) {
		System.out.println("姓名：");
		return sc.next();
		
	}
	
	public static void main(String[] args) {
		Poker p=new Poker();
		p.setNums();
		p.setSuits();
		Scanner sc=new Scanner(System.in);		
		System.out.println("请输入玩家个数");
		int i=sc.nextInt();
		Player[] plays=new Player[i];
		for(int j=0;j<i;j++) {
			System.out.printf("请输入第%d玩家ID和姓名：\n",j+1);
			 plays[j]= new Player(getId(sc),getName(sc));
		}
		
		Game.compaerBoard(Game.handOutBoard(Game.radom(Game.boardGenerate(p)), plays));
		
		sc.close();
	}	
	
}
