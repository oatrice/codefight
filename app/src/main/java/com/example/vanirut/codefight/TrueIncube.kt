package com.example.vanirut.codefight

/**
 * Created by vanirut on 7/12/2017.
 */
fun findPrimeNumber(){
    val primeNumbers : ArrayList<Int> = ArrayList()
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
    println("total prime number is: ${primeNumbers.size}")

}

fun findPrimeNumber2() {
    var flag = 0
    val n = 17 //it is the number to be checked
    val m = n / 2
    for(i in 2..m){
        if(n % i == 0){
            System.out.println("Number is not prime")
            flag = 1
            break
        }
    }
    if(flag == 0)
        System.out.println("Number is prime")
}

fun findPrimeNumber3() {
    var count = 0
    for (number in 1..1000000) {
        var flag = 0
        val n = number //it is the number to be checked
        val m = n / 2
        for(i in 2..m){
            if(n % i == 0){
//                System.out.println("Number is not prime")
                flag = 1
                break
            }
        }
        if(flag == 0){
            count++
            System.out.println("$m is prime")

        }
    }
    println("total prime number is: $count")
}

fun findPrimeNumber4() {
    val primeNumbers : ArrayList<Int> = ArrayList()
    primeNumbers.add(2)

    for (number in 2..1000000) {

        val middleNumber = number / 2

        for (primeNumberIndex in 0..primeNumbers.size - 1) {

            if (number % primeNumbers[primeNumberIndex] == 0) {
//                println("A: $number")
                break

            } else if (primeNumbers[primeNumberIndex] > middleNumber){
                println("Prime number: $number")
                primeNumbers.add(number)
                break
            }

        }

    }
    println("total prime number is: ${primeNumbers.size}")

}

fun findPrimeNumber44() {
    val primeNumbers : ArrayList<Int> = ArrayList()
    primeNumbers.add(2)

    for (number in 2..1000000) {

        val middleNumber = number / 2

        for (primeNumberIndex in 0..primeNumbers.size - 1) {

            if (number % primeNumbers[primeNumberIndex] == 0) {
//                println("A: $number")
                break

            } else if (primeNumbers[primeNumberIndex] > middleNumber){
                primeNumbers.add(number)
                break
            }

        }

    }

    for (primeNumber in primeNumbers) {
        println("Prime number: $primeNumber")

    }
    println("Total prime number is: ${primeNumbers.size}")

}

fun findPrimeNumber5() {
    val primeNumbers : ArrayList<Int> = ArrayList()
//    primeNumbers.add(2)

    for (number in 1..1000000) {

        val middleNumber = number / 2

        for (primeNumberIndex in 0..primeNumbers.size - 1) {

            if (number % primeNumbers[primeNumberIndex] == 0) {
//                println("A: $number")
                break

            } else if (primeNumbers[primeNumberIndex] > middleNumber){
                println("Prime number: $number")
                primeNumbers.add(number)
                break
            }

        }

        if (number > 1 && primeNumbers.isEmpty()){
            println("Prime number: $number")
            primeNumbers.add(number)
        }

    }
    println("total prime number is: ${primeNumbers.size}")

}