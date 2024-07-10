package utils

import java.io.File

fun String.toIntList() = trimIndent().split('\n').map { it.toInt() }

fun readInput(day: Int) = File("src/main/resources/input/day${day.toString().padEnd(2)}.txt").readText()