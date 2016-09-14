package com.learning.inheritance;

public class Triangle extends Rectangle {
	float a;
	
	Triangle(int u, int v){
		super(u,v);
	}
	
	float getTriangle(){
		
		 a = (float)1/2*l*b;
		 return a;
	}
	
	public static void main(String[] args) {
		
		Triangle tr = new Triangle(20,30);
		
		System.out.println("Area of rectangle is : "+tr.getRectangle());
		System.out.println("Area of triangle is :" +tr.getTriangle());
	}
}
