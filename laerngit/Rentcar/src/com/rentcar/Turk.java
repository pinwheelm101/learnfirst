package com.rentcar;

public class Turk extends Car implements Icargo {
     private int CargoWeight;
     
     public Turk(String name,int price,int CargoWeight) {
    	 super(name,price);
    	 this.CargoWeight=CargoWeight;
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
	public String getType() {
		// TODO Auto-generated method stub
		return "ø…‘ÿªı£∫"+CargoWeight+"∂÷";
	}

}
