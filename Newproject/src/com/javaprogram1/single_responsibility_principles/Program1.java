package com.javaprogram1.single_responsibility_principles;


public class Program1 {
    public static void main(String[] args) {
        ArithmeticCalculator calculator = new ArithmeticCalculator();
        ConsolePrinter printer = new ConsolePrinter();
 
        int result = calculator.add(5, 10);
        printer.print(result);
 
        result = calculator.subtract(10, 3);
        printer.print(result);
    }
}
