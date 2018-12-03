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
        print("Area: $result")
    }

    @Test
    fun part1GivenTestData() {
//        var input = arrayListOf<String>("#1 @ 1,3: 4x4", "#2 @ 3,1: 4x4", "#3 @ 5,5: 2x2")
        var input = arrayListOf<String>("#1 @ 1,3: 2x2", "#2 @ 2,3: 2x2")
        var result = d3.part1(input)
        print("Area: $result")
    }

    @Test
    fun parseRow() {
        print(d3.parseRow("#1 @ 1,3: 4x4"))
    }
}