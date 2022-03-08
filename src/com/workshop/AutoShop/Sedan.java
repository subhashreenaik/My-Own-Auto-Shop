package com.workshop.AutoShop;

public class Sedan extends Car {
	
//sub class
int length;

//constructor for initializing field of superclass
public Sedan(int speed, double regularPrice, String color, int length) {
	super(speed, regularPrice, color);
	this.length = length;
}

//Declaring method with return type double,it computing saleprice of Sedan
double getSalePrice() {
	double discountPrice;
	if(length>20) {
		discountPrice = (regularPrice *5)/100;
		return regularPrice-discountPrice;
	}
	else {
		
		discountPrice = (regularPrice *10)/100;
		return regularPrice-discountPrice;
	}
	
}
}
