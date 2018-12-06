package com.sorkmos.aoc2018.day3

import com.sorkmos.aoc2018.utils.Utils
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

internal class Day3Test {

    private lateinit var d3: Day3


    @BeforeEach
    fun setup() {
        d3 = Day3()
    }


    @Test
    fun part1Test() {
        val input = Utils.fileToStringList("src/test/resources/Day3P1.txt")
        var result = d3.part1(input)
        print("part1 claims: $result")
    }

    @Test
    fun part2Test() {
        val input = Utils.fileToStringList("src/test/resources/Day3P1.txt")
        val result = d3.part2(input)
        print("part2 id: $result")
    }
}

