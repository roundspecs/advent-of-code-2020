package day2

import utils.*

fun main() {
    val input = readInput(2)
    println(part1(input))
    println(part2(input))
}

fun String.extractInfo(): Triple<Pair<Int, Int>, Char, String> {
    val words = split(" ")
    val (first, second) = words[0].split("-").map { it.toInt() }
    val letter = words[1].first()
    val password = words[2]
    return Triple(Pair(first, second), letter, password)
}

fun part1(input: String): Int = input.split("\n").count {
    val (range, letter, password) = it.extractInfo()
    val occurrenceCount = password.count { it == letter }
    range.first <= occurrenceCount && range.second >= occurrenceCount
}

fun part2(input: String): Int = input.split("\n").count {
    val (positions, letter, password) = it.extractInfo()
    val (first, second) = positions
    (password[first - 1] == letter) xor (password[second - 1] == letter)
}
