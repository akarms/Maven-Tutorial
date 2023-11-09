package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;


public class CalculatorTest{
        Calculator calc = new Calculator();

        @BeforeClass
        public void beforeClass(){
            System.out.println("Before Class");
        }

        @AfterClass
        public void afterClass(){
            System.out.println("After Class");
        }

        @BeforeMethod
        public void beforeMethod(){
            System.out.println("Before Method");
        }


//adding meth 2 by multiple inputs --------------------------
@DataProvider(name = "dataForAddition")
public Object[][] dataForAdd() {
return new Object[][] {
{ 1, 2, 3 },
{ 2, 3, 5 },
{ 3, 3, 6 }
};
}

@Test(dataProvider = "dataForAddition",
groups = "BasicOperations" ,
priority = 1)
public void testAdd2(int a, int b, int expectedResult) {
    Assert.assertEquals(calc.add(a, b), expectedResult);
    System.out.println("Test Add2");
}

//-----------------------------------------------------


          @Test(groups = "BasicOperations" ,
          priority = 1)
           public void testadd(){
        // int actualSum = calc.add(2, 3);
        // int expectedSum = 5;
        // if(actualSum != expectedSum){
        //     throw new Error("2 + 3 should be 5");
        // }
        //we  can do those thing alternativly bt 
        Assert.assertEquals(calc.add(2, 5), 7);
        System.out.println("Test Add");
           }

               @Test(groups = "BasicOperations" ,
               priority =  2)
               public void testSubtract() {
               Assert.assertEquals(calc.subtract(3, 2), 1);
               System.out.println("Test Subtract");
                                            }

               @Test(groups = "AdvancedOperations")
               public void testMultiply() {
               Assert.assertEquals(calc.multiply(3, 2), 6);
                System.out.println("Test Multiply");
               }           
               
               @Test(groups = "AdvancedOperations")
               public void testDivide() {
               Assert.assertEquals(calc.divide(6, 2), 3);
                System.out.println("Test Divide");
            }



}