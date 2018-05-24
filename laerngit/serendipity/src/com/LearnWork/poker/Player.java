package com.LearnWork.poker;

import java.util.ArrayList;
import java.util.List;

public class Player implements Comparable<Player>{
	private int id;
	private String name;
	private Board board;
	
	public Player() {}
	
	public Player(int id ,String name,Board board) {
		this.name=name;
		this.id=id;
		this.board=board;
	}
	
	public Player(int id ,String name) {
		this.id=id;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	@Override
	public int compareTo(Player o) {
		// TODO Auto-generated method stub
		return board.compareTo(o.board);
	}	
		
	

	@Override
	public String toString() {
		return "玩家姓名："+name+"\n"+"玩家ID:"+id+"\n"+"玩家手牌:"+board+"\n";
	}
	
	
}
