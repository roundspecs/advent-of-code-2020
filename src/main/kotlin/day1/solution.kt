package day1

import utils.*

fun main() {
    val input = readInput(1)
    println(part1(input))
    println(part2(input))
}

fun getPairProductOfSum(nums: List<Int>, sum: Int = YEAR): Int? {
    val seen = HashSet<Int>()
    for (num in nums) {
        if ((sum - num) in seen) return num * (sum - num)
        seen.add(num)
    }
    return null
}

fun part1(input: String): Int {
    val nums = input.split('\n').map { it.toInt() }
    return getPairProductOfSum(nums)!!
}

fun part2(input: String): Int {
    val nums = input.split('\n').map { it.toInt() }
    for (i in nums.indices) {
        val pairProduct = getPairProductOfSum(nums.subList(0, i), YEAR - nums[i])
        if (pairProduct != null) return pairProduct * nums[i]
    }
    return -1
}
