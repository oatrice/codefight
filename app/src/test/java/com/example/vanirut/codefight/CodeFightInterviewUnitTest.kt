package com.example.vanirut.codefight

import com.example.vanirut.codefight.interview_practice.BasicGraph
import org.junit.Test
import org.junit.Assert.assertEquals

/**
 * Created by vanirut on 7/21/2017.
 */
class CodeFightInterviewUnitTest {

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
                        intArrayOf()),
                arrayOf(
                        intArrayOf(1,2),
                        intArrayOf(2),
                        intArrayOf(),
                        intArrayOf(4),
                        intArrayOf(3))
        )

        val expected = arrayOf(
                true, false, true)


        for (i in 0..inputs.lastIndex) {
            val output = BasicGraph.hasDeadlock(inputs[i])
//            assertEquals(true, true)
            assertEquals(expected[i], output)

        }
    }

}