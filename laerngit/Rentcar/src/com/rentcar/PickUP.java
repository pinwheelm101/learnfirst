package com.rentcar;

public class PickUP extends Car implements Ipassenger,Icargo{
       private int PassengerNum;
       private int CargoWeight;
       
       public PickUP(String name,int price,int PassengerNum,int CargoWeight) {
    	   super(name,price);
    	   this.CargoWeight=CargoWeight;
    	   this.PassengerNum=PassengerNum;
       }

	@Override
	public void setCargoWeight(int CargoWeight) {
		// TODO Auto-generated method stub
		this.CargoWeight=CargoWeight;
	}

	@Override
	public int getCargoWeight() {
		// TODO Auto-generated method stub
		return CargoWeight;
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
		return "可载人:"+PassengerNum+"人"+"可载货:"+CargoWeight+"吨";
	}

}
