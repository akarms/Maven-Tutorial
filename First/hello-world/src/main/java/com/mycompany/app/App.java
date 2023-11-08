package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int num1 = 100;
        int num2 = 10;

        System.out.println("Addition of " + num1 + " and " + num2 + " is " + calculator.add(num1, num2));
        System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + calculator.sub(num1, num2));
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + calculator.mul(num1, num2));
        System.out.println("Division of " + num1 + " and " + num2 + " is " + calculator.div(num1, num2));

    }
}
