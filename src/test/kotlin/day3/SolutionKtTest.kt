package day3

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SolutionKtTest {
    val input = """
        ..##.......
        #...#...#..
        .#....#..#.
        ..#.#...#.#
        .#...##..#.
        ..#.##.....
        .#.#.#....#
        .#........#
        #.##...#...
        #...##....#
        .#..#...#.#
    """.trimIndent()

    @Test
    fun part1() {
        assertEquals(7, part1(input))
    }

    @Test
    fun part2() {
        assertEquals(336, part2(input))
    }
}