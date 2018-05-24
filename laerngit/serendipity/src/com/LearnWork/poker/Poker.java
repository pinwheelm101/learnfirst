package com.LearnWork.poker;

public class Poker extends Board {
 
	private String[] nums;
    private String[] suits;
    
    public Poker() {}
    


//	public Poker(String[] nums, String[] suits) {
//		this.nums=nums;
//		this.suits=suits;
//	}

	public String[] getNums() {
		return nums;
	}

	public void setNums() {
		this.nums = new String[]  {"2","3","4","5","6","7","8","9","10","J","L","K","A"};
	}

	public String[] getSuits() {
		return suits;
	}

	public void setSuits() {
		this.suits = new String[] {"方片","梅花","红桃","黑桃"};
	}	
	
  
 
}
