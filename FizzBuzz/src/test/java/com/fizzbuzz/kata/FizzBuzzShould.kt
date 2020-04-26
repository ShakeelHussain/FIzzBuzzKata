package com.fizzbuzz.kata;

import org.junit.Assert
import org.junit.Test


class FizzBuzzShould {

    @Test
    fun `give exact number as string if not divisible by 3 and 5`() {
        val fizBuzz: FizzBuzz = FizzBuzz()
        Assert.assertEquals("1", fizBuzz.fizzBuzz(1))
        Assert.assertEquals("2", fizBuzz.fizzBuzz(2))
        Assert.assertEquals("4", fizBuzz.fizzBuzz(4))
    }

    @Test
    fun `give fizz as string if number is divisible by 3`() {
        val fizBuzz: FizzBuzz = FizzBuzz()
        Assert.assertEquals("fizz", fizBuzz.fizzBuzz(3))
        Assert.assertEquals("fizz", fizBuzz.fizzBuzz(6))
        Assert.assertEquals("fizz", fizBuzz.fizzBuzz(9))
    }

    @Test
    fun `give buzz as string if number is divisible by 5`() {
        val fizBuzz: FizzBuzz = FizzBuzz()
        Assert.assertEquals("buzz", fizBuzz.fizzBuzz(5))
        Assert.assertEquals("buzz", fizBuzz.fizzBuzz(10))
        Assert.assertEquals("buzz", fizBuzz.fizzBuzz(20))
    }

    @Test
    fun `give fizzbuzz as string if number is divisible by both 5 and 3`() {
        val fizBuzz: FizzBuzz = FizzBuzz()
        Assert.assertEquals("fizzbuzz", fizBuzz.fizzBuzz(15))
        Assert.assertEquals("fizzbuzz", fizBuzz.fizzBuzz(30))
    }

}