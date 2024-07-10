import java.io.File

const val YEAR = 2020

fun String.toIntList() = trimIndent().split('\n').map { it.toInt() }

fun readInput(day: Int) = File("src/main/resources/input/day${day.toString().padStart(2, '0')}.txt").readText()