package com.javaprogram4.Dependency_Inversion;

public class Type {
	public static void main(String[] args) {
	    Calculator calculator = new Calculator();

	 
	    calculator.setOperation(new Addition());
	    int result = calculator.calculate(2, 3);
	    System.out.println("Addition of two numbers :"+result); 

	
	    calculator.setOperation(new Multiplication());
	    result = calculator.calculate(2, 3);
	    System.out.println("Multiplication of two numbers :"+result); 
	}
}
