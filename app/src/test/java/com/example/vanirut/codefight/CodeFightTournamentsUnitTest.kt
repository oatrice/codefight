package com.example.vanirut.codefight

import com.example.vanirut.codefight.tournaments.Tournaments
import org.junit.Test

/**
 * Created by vanirut on 7/21/2017.
 */
class CodeFightTournamentsUnitTest {

    @Test
    @Throws(Exception::class)
    fun exercise_elaboration() {
        Tournaments.exerciseElaboration(25, 45)

    }

    @Test
    @Throws(Exception::class)
    fun concatenate_numbers() {
        Tournaments.concatenateNumbers(25, 45)

    }
}