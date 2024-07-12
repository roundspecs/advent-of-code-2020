package day2

import utils.*

fun main() {
    val input = readInput(2)
    println(part1(input))
    println(part2(input))
}

data class PasswordWithPolicy(val range: Pair<Int, Int>, val letter: Char, val password: String) {
    companion object {
        fun parse(line: String): PasswordWithPolicy {
            val words = line.split(" ")
            val (first, second) = words[0].split("-").map { it.toInt() }
            val letter = words[1].first()
            val password = words[2]
            return PasswordWithPolicy(Pair(first, second), letter, password)
        }
    }
}

fun part1(input: String): Int = input.split("\n").count {
    val (range, letter, password) = PasswordWithPolicy.parse(it)
    password.count { ch -> ch == letter } in range.first..range.second
}

fun part2(input: String): Int = input.split("\n").count {
    val (positions, letter, password) = PasswordWithPolicy.parse(it)
    val (first, second) = positions
    (password[first - 1] == letter) xor (password[second - 1] == letter)
}
