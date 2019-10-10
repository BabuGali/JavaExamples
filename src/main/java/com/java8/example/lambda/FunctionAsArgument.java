package com.java8.example.lambda;

public class FunctionAsArgument {

	interface Circle {
		double get(double radius);
	}
	
	public double circleOperations(double radius,Circle c) {
		return c.get(radius);
	}

	public static void main(String[] args) {

		// Start Circle Operations
		FunctionAsArgument faa= new FunctionAsArgument();
		Circle circleArea = (r) -> Math.PI * r * r;
		Circle circleCircumference = (r) -> 2 * Math.PI * r;
		double cArea=faa.circleOperations(6, circleArea);
		double cCircumference = faa.circleOperations(6, circleCircumference);
		System.out.println("circleArea : "+cArea);
		System.out.println("circleCircumference : "+cCircumference);
				
		// End Circle Operations
		

	}

}
