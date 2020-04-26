package com.fizzbuzz.kata

class FizzBuzz {
    fun fizzBuzz(number: Int): String {
        if ( isDivisibleByFive(number) && isDivisibleByThree(number)) {
            return "fizzbuzz"
        }
        if (isDivisibleByThree(number)) {
            return "fizz"
        }
        if (isDivisibleByFive(number)) {
            return "buzz"
        }
        return number.toString();
    }

    private fun isDivisibleByFive(number: Int) = number % 5 == 0

    private fun isDivisibleByThree(number: Int) = number % 3 == 0

}
