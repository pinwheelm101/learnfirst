package com.LearnWork.poker;

public class Board implements Comparable<Board>{		
		
	private String[] nums;		
	private String[] suits;
	private String board;
	private int no;
		
		public Board() {}
		
		public Board(int no , String board) {
			this.no = no;
			this.board =board;
		}
		
		public Board(String[] nums,String[] suits) {
			this.nums=nums;
			this.suits=suits;
		}
		
		public String[] getNums() {
			return nums;
		}
		public void setNums(String[] nums) {
			this.nums = nums;
		}
		public String[] getSuits() {
			return suits;
		}
		public void setSuits(String[] suits) {
			this.suits = suits;
		}

		@Override
		public String toString() {
			return board + " 编号：" + no ;
		}

		@Override
		public  int compareTo(Board board) {
			// TODO Auto-generated method stub
			return Integer.compare(board.no,no);
		}
		
		
}
