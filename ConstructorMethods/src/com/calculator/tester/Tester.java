package com.calculator.tester;

import com.calculator.Calculator;

public class Tester {
    public static void main(String[]args){
        Calculator calculator=new Calculator(5,5); //Calculator object with the values 5 and 5
        Calculator calculator2=new Calculator(); // Calculator2 object with default constructor
        calculator.addition(); //Calling the Addition Method
        calculator.subtraction(); //Calling the Subtraction Method
        calculator.multiplication(); //Calling the Multiplication Method
        calculator.division(); //Calling the Division Method

    }
}
