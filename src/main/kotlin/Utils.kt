package utils

import java.io.File

const val YEAR = 2020

fun readInput(day: Int) = File("src/main/resources/input/day${day.toString().padStart(2, '0')}.txt").readText()