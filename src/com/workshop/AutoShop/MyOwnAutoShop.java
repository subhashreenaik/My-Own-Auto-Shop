package com.workshop.AutoShop;

public class MyOwnAutoShop {

	/* 
	 * This is Main method to manipulate all the class 
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Car  car= new Car(100, 500000, "Pearl White");
    System.out.println("Sales price of car is  "+car.getSalePrice());
    
    Sedan sedan = new Sedan(150, 700000, "black", 30);
    System.out.println("Sales price of Sedan with "+sedan.length+" is  "+sedan.getSalePrice());
    
    Ford ford1 = new Ford(200, 600000, "grey", 2022, 5);
    System.out.println("Sales price of Ford of "+ford1.color+" is "+ford1.getSalePrice());
    
    Ford ford2 = new Ford(200, 650000, "black", 2022, 10);
    System.out.println("Sales price of Ford of "+ford2.color+" is  "+ford2.getSalePrice());
	}

}
