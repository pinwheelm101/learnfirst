package com.rentcar;

public class PassengerCar extends Car implements Ipassenger {
     private int PassengerNum;
     public PassengerCar(String name,int price,int PassengerNum) {
    	 super(name,price);
    	 this.PassengerNum=PassengerNum;
     }
	@Override
	public void setPassengerNum(int PassengerNum) {
		// TODO Auto-generated method stub
		this.PassengerNum=PassengerNum;
	}
	@Override
	public int getPassengerNum() {
		// TODO Auto-generated method stub
		return PassengerNum;
	}
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "ø…‘ÿ»À£∫"+PassengerNum+"»À";
	}

}
