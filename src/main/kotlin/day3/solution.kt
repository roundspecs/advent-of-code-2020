package day3

import utils.*

fun main() {
    val input = readInput(3)
    println(part1(input))
    println(part2(input))
}

data class Slope(val right: Int, val down: Int)

fun Array<String>.countTreesEncountered(
    slope: Slope,
    treeSquare: Char = '#',
): Int {
    val width = this[0].length
    var treeCount = 0
    for ((index, downSteps) in (0..this.lastIndex step slope.down).withIndex()) {
        val rightSteps = slope.right * index % width
        if (this[downSteps][rightSteps] == treeSquare)
            ++treeCount
    }
    return treeCount
}

fun part1(input: String): Int {
    return input.split('\n').toTypedArray().countTreesEncountered(Slope(3, 1))
}

fun part2(input: String): Long {
    var product = 1L
    val slopes = arrayOf(
        Slope(1,1),
        Slope(3,1),
        Slope(5,1),
        Slope(7,1),
        Slope(1,2),
    )
    val lines = input.split('\n').toTypedArray()
    slopes.forEach {
        product *= lines.countTreesEncountered(it)
    }
    return product
}
