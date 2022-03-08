package com.workshop.AutoShop;

//Super class
public class Car {
	
int speed;
double regularPrice;
String color;

//Declaring method with return type double,it computing saleprice of Car
double getSalePrice() {
	
	
	return regularPrice;
	
}

//Constructor of super class
public Car(int speed, double regularPrice, String color) {
	super();
	this.speed = speed;
	this.regularPrice = regularPrice;
	this.color = color;
}
}
