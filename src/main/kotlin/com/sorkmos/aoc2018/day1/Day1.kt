package com.sorkmos.aoc2018.day1

import com.sorkmos.aoc2018.day0.AdventOfCode
import com.sorkmos.aoc2018.utils.Utils
import java.io.File
import java.nio.file.Files
import java.nio.file.Files.readAllLines

class Day1 : AdventOfCode {
    override fun part1(): String {
        val result = readAllLines(File("src/main/resources/Day1P1.txt").toPath())
            .fold(0) { sum, element -> sum + Integer.valueOf(element) }
        return result.toString()
    }

    override fun part2(): String {
//        val sums = listOf<Int>()
        val sums = mutableListOf<Int>()
        val result = readAllLines(File("src/main/resources/Day1P2.txt").toPath())
            .fold(0) {
                sum, element ->
                    val num : Int = Integer.valueOf(element)
                    if(sums.contains(num)) {
                        sum
                    }else {
                        print("${sums}\n")

                        sums.add(num)
                        sum + Integer.valueOf(element)
                    }
            }
        return result.toString()
    }

}