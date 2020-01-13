package com.softserveinc.edu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void fibonacciPass() {
        String first10FibonacciNumbers = "1 1 2 3 5 8 13 21 34 55 89 144 ";
        assertEquals(first10FibonacciNumbers, App.fibonacci(10), "Numbers "+ first10FibonacciNumbers+" are not equal to real fibonacci numbers.");
    }

    @Test
    void fibonacciFail() {
        String first10FibonacciNumbers = "1 1 2 3 5 8 13 21 34 55 89 144 ";
        assertEquals(first10FibonacciNumbers, App.fibonacci(9), "Numbers "+ first10FibonacciNumbers+" are not equal to real fibonacci numbers.");
    }
}