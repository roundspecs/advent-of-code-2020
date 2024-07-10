package day2

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class SolutionKtTest {
    val input = """
        1-3 a: abcde
        1-3 b: cdefg
        2-9 c: ccccccccc
    """.trimIndent()

    @Test
    fun part1() {
        assertEquals(2, part1(input))
    }

    @Test
    fun part2() {
        assertEquals(1, part2(input))
    }
}