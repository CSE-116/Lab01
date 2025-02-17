package tests;

import org.junit.Test;

import static labs.Lab01.*;
import static org.junit.Assert.assertEquals;

public class Test01 {
    public final double delta = .00001;

    @Test
    public void additionTest(){
        assertEquals(addition(5,3), 8,delta); //normal test
        assertEquals(addition(3,3), 6,delta); //same number test
        assertEquals(addition(0,0), 0,delta); //zero test
        assertEquals(addition(7,5), 12,delta); // big numbers test
        assertEquals(addition(-20,10), -10,delta); //negative test
        assertEquals(addition(-12,-2), -12,delta); // double negative numbers test
    }

    @Test
    public void subtractionTest(){
        assertEquals(subtraction(2,1), 1,delta); //normal test
        assertEquals(subtraction(5,5), 0,delta); //same number test
        assertEquals(subtraction(0,0), 0,delta); //zero test
        assertEquals(subtraction(200,100), 100,delta); //big numbers test
        assertEquals(subtraction(-12,2), -14,delta); // negative numbers test
        assertEquals(subtraction(-12,-2), -10,delta); // double negative numbers test
    }

    @Test
    public void multiplicationTest(){
        assertEquals(multiplication(3,4), 12,delta); //normal test
        assertEquals(multiplication(1,1), 1,delta); //same number test
        assertEquals(multiplication(0,0), 0,delta); //zero test
        assertEquals(multiplication(25,20), 500,delta); //big numbers test
        assertEquals(multiplication(10,-5), -50,delta); //negative numbers test
        assertEquals(multiplication(-5,-2), 10,delta); //double negative numbers test
    }




}
