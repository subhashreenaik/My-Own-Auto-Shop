package com.workshop.AutoShop;

public class Truck extends Car {
	
//Sub class	
int weight;

//constructor for initializing field of superclass
public Truck(int speed, double regularPrice, String color, int weight) {
	super(speed, regularPrice, color);
	this.weight = weight;
}

//Declaring method with return type double,it computing saleprice of Truck
public double getSalePrice() {
double discountPrice;
if(weight>2000) {
	discountPrice = (regularPrice *10)/100;
	return regularPrice-discountPrice;
}
else {
	
	discountPrice = (regularPrice *20)/100;
	return regularPrice-discountPrice;
}
}
}
