package com.sorkmos.aoc2018.day1

import java.io.File
import java.nio.file.Files.readAllLines

class Day1 {

    fun part1(rows: MutableList<String>): String {
        val result = rows.fold(0) { sum, element -> sum + Integer.valueOf(element) }
        return result.toString()
    }

    fun part2(input: List<String>): Int {
        val set = mutableSetOf<Int>()
        var freq = 0
        val numbers = input.map { it.toInt() }
        while (true) {
            for (i in numbers) {
                freq += i
                if (set.contains(freq)) {
                    println("done")
                    return freq
                }
                set += freq
            }
        }
    }

}