package com.LearnWork;

public class Pet {
	private int health;
	
	public Pet pet;
	
	public  Pet() {}
	
	
	
	public Pet(int health) {
		
		this.health=health;
	}

	

	
	
	public int getHealth() {
		return health;
	}



	public void setHealth(int health) {
		this.health = health;
	}



	public int feed(Pet pet) {
		
		if(pet instanceof Dog) {
			health+=3;
		}else if(pet instanceof Penguin) {
			health+=5;
		}
		if(health>100)return 100 ;		
		return health;
	}
	
}
