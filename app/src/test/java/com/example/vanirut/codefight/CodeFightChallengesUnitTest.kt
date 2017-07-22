package com.example.vanirut.codefight

import com.example.vanirut.codefight.challenges.Challenges
import org.junit.Test

/**
 * Created by vanirut on 7/21/2017.
 */
class CodeFightChallengesUnitTest {

    @Test
    @Throws(Exception::class)
    fun digitSums_difference() {
        Challenges.digitSumsDifference(10)

    }

    @Test
    @Throws(Exception::class)
    fun digits_product() {
        Challenges.digitsProduct(10)

    }
}