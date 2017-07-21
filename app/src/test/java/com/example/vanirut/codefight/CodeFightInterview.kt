package com.example.vanirut.codefight

import com.example.vanirut.codefight.interview_practice.CodeFightBasicGraph
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by vanirut on 7/21/2017.
 */
class CodeFightInterview {

    @Test
    @Throws(Exception::class)
    fun hasDeadlock() {

        val inputs = arrayOf(
                arrayOf(
                        intArrayOf(1),
                        intArrayOf(2),
                        intArrayOf(3, 4),
                        intArrayOf(4),
                        intArrayOf(0)),
                arrayOf(
                        intArrayOf(1, 2, 3),
                        intArrayOf(2, 3),
                        intArrayOf(3),
                        intArrayOf())
        )

        val expected = arrayOf(
                true, false)


        for (i in 0..inputs.lastIndex) {
            val output = CodeFightBasicGraph.hasDeadlock(inputs[i])
            assertEquals(expected[i], output)

        }
    }

}