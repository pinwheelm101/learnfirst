package com.LearnWork.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
	public static List<Board> boardGenerate(Board board){
		List<Board> boards=new ArrayList<Board>();
		int k=0;
		 for(int i=0,a=board.getNums().length;i<a;i++) {
			for(int j=0,b=board.getSuits().length;j<b;j++) {
				boards.add(new Board(k++,board.getSuits()[j]+board.getNums()[i]));
			}
		}								 
		 		 return boards;
	}
	
	
	public static List<Board> radom(List<Board> boards){
		Collections.shuffle(boards);
//		Collections.sort(boards);
		return boards;
	
	} 
	
	public static List<Player> handOutBoard(List<Board> boards,Player[] plays){
		 List<Player> playBoards=new ArrayList<Player>();		
		  for(int i=0,a=plays.length;i<a;i++) {
			 for(int j=0;j<2;j++) {
				playBoards.add(new Player(plays[i].getId(),plays[i].getName(),boards.get(j)));
				boards.remove(j);
			}
		  }	  
//			System.out.println(playBoards.size());
//			for(Player playBoard:playBoards) {
//				System.out.println(playBoard.toString());
//			}
			return playBoards;
	}
	
	public static void compaerBoard(List<Player> playBoards) {
//			System.out.println(playBoards.size());
			Collections.sort( playBoards);
//			System.out.println(playBoards.get(0).toString());
			System.out.println("玩家手牌分别为：");
			for(Player playBoard:playBoards) {
				System.out.println(playBoard.toString());			
			}
			
//			根据id去重
			int k=0;
			List<Integer> ids=new ArrayList<Integer>();
			boolean flag;
			for(int i=0,a=playBoards.size();i<a;i++) {
				flag=false;
				for(int j=0,b=ids.size();j<b;j++) {
					if(playBoards.get(i).getId()==ids.get(j)) {
						flag=true;
						break;
					}
				}
					if(!flag) {
						ids.add(playBoards.get(i).getId());
						k++;
						System.out.printf("第%d名是：%s\n最大手牌是：%s\n",k,playBoards.get(i).getName(),playBoards.get(i).getBoard().toString());
					}
			}	
				
			System.out.println("获胜玩家为："+playBoards.get(0).getName()+"!!");			
				
					
			
			
			
	}
}
