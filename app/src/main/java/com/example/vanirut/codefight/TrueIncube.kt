package com.example.vanirut.codefight

/**
 * Created by vanirut on 7/12/2017.
 */
fun findPrimeNumber(){
    var primeNumbers : ArrayList<Int> = ArrayList()
    primeNumbers.add(1)
    primeNumbers.add(2)

    for (number in 2..1000000) {

        for (primeNumberIndex in 1..primeNumbers.size - 1) {

            if (number % primeNumbers[primeNumberIndex] == 0) {
//                println("A: $number")
                break

            } else if ((number % primeNumbers[primeNumberIndex] != 0) &&
                    (primeNumberIndex == primeNumbers.size - 1)){
                println("Prime number: $number")
                primeNumbers.add(number)
            }

        }

    }
}