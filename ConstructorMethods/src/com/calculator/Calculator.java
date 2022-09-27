package com.calculator;

public class Calculator {
    int num1; //Variable 1
    int num2; //Variable 2

    public Calculator(){      //Default Constructor
        System.out.println("Default constructor with no args");
    }

    public Calculator(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }

    //Addition method
   public void addition(){
        int sum;
        sum=num1+num2;
        System.out.println("Sum of " + num2+ "+"+ num2 + "="+sum);
    }

    //Subtraction method
    public void subtraction(){
        int subtraction;
        subtraction=num1-num2;
        System.out.println("Subtraction of " + num2+ "-"+ num2 + "="+subtraction);
    }

    //Multiplication method

    public void multiplication(){
        int multiplication;
        multiplication=num1*num2;
        System.out.println("Multiplication of " + num2+ "*"+ num2 + "="+multiplication);
    }

    //Division method
    public void division(){
        int division;
        division=num1/num2;
        System.out.println("Division of " + num2+ "/"+ num2 + "="+division);
    }

}
