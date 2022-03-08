package com.workshop.AutoShop;

public class Ford extends Car {
	
//sub class
int year;
int manufactureDiscount;


//constructor for initializing field of superclass
public Ford(int speed, double regularPrice, String color, int year, int manufactureDiscount) {
	super(speed, regularPrice, color);
	this.year = year;
	this.manufactureDiscount = manufactureDiscount;
}


//Declaring method with return type double,it computing saleprice of Ford
public double getSalePrice() {
	double discountPrice;
	discountPrice = (regularPrice *manufactureDiscount)/100;
	return regularPrice -discountPrice;
	
}
}
