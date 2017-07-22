package com.example.vanirut.codefight

import com.example.vanirut.codefight.job_skill.SkillTestForJobs
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by vanirut on 7/21/2017.
 */
class CodeFightJobsSkillUnitTest {

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
            val output = SkillTestForJobs.constructSubmatrix(inputs[i], rmRows[i], rmColumns[i])
//            assertEquals(true, true)
            assertEquals(expected[i], output)

        }
    }*/

    /*@Test
    @Throws(Exception::class)
    fun periodicSequence() {
        val output = SkillTestForJobs.periodicSequence(11, 2, 6, 12)
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
            val output = SkillTestForJobs.textJustificationImproved(input[i], width[i])
//            assertEquals(true, true)
            assertEquals(expected[i], output)
        }

    }

}