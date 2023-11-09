package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest{
        Calculator calc = new Calculator();

    @Test
    public void testadd(){

        // int actualSum = calc.add(2, 3);
        // int expectedSum = 5;
        // if(actualSum != expectedSum){
        //     throw new Error("2 + 3 should be 5");
        // }
        //we  can do those thing alternativly bt 

        Assert.assertEquals(calc.add(2, 5), 7);

    }

           @Test
               public void testSubtract() {
               Assert.assertEquals(calc.subtract(3, 2), 1);
                                            }

               @Test
               public void testMultiply() {
               Assert.assertEquals(calc.multiply(3, 2), 6);
               }           
               
               @Test
               public void testDivide() {
               Assert.assertEquals(calc.divide(6, 2), 3);
            }



}