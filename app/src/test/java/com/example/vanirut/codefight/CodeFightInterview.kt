package com.example.vanirut.codefight

import com.example.vanirut.codefight.interview_practice.CodeFightBasicGraph
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by vanirut on 7/21/2017.
 */
class CodeFightInterview {

    /*@Test
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
            val output = CodeFightBasicGraph.hasDeadlock(inputs[i])
//            assertEquals(true, true)
            assertEquals(expected[i], output)

        }
    }*/

    /*@Test
    @Throws(Exception::class)
    fun constructSubmatrix() {
        val inputs = arrayOf(
            arrayOf(
                intArrayOf(1, 0, 0, 2),
                intArrayOf(0, 5, 0, 1),
                intArrayOf(0, 0, 3, 5))
        )

        val rmRows = arrayOf(intArrayOf(1))
        val rmColumns = arrayOf(intArrayOf(0, 2))

        val expected = arrayOf(
            arrayOf(
                intArrayOf(0, 2),
                intArrayOf(0, 5))
        )

        for (i in 0..inputs.lastIndex) {
            val output = CodeFightBasicGraph.constructSubmatrix(inputs[i], rmRows[i], rmColumns[i])
//            assertEquals(true, true)
            assertEquals(expected[i], output)

        }
    }*/

    /*@Test
    @Throws(Exception::class)
    fun periodicSequence() {
        val output = CodeFightBasicGraph.periodicSequence(11, 2, 6, 12)
        assertEquals(2, output)
//        assertEquals(expected[i], output)

    }*/

    @Test
    @Throws(Exception::class)
    fun textJustification() {

        val input = arrayOf(
                arrayOf("This", "is", "an", "example", "of", "text", "justification."),
                arrayOf("Two", "words."),
                arrayOf("Looks",
                        "like",
                        "it",
                        "can",
                        "be",
                        "a",
                        "tricky",
                        "test"),
                arrayOf("Two",
                        "words."),
                arrayOf("Extra",
                        "spaces",
                        "between",
                        "words",
                        "should",
                        "be",
                        "distributed",
                        "as",
                        "evenly",
                        "as",
                        "possible"))
        val width = intArrayOf(16, 11, 25, 10, 20)
        val expected = arrayOf(
                arrayOf("This    is    an", "example  of text", "justification.  "),
                arrayOf("Two words. "),
                arrayOf("Looks  like  it  can be a",
                        "tricky test              "),
                arrayOf("Two words."),
                arrayOf("Extra spaces between",
                        "words    should   be",
                        "distributed       as",
                        "evenly as possible  "))

//        val output = CodeFightBasicGraph.textJustification(input, 16)
        for (i in 0..input.lastIndex) {
            val output = CodeFightBasicGraph.textJustification2(input[i], width[i])
//            assertEquals(true, true)
            assertEquals(expected[i], output)
        }

    }

}