package com.sorkmos.aoc2018.day1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import java.io.File
import java.nio.file.Files

internal class Day1Test {

    private lateinit var day1: Day1

    @BeforeEach
    fun setup() {
        day1 = Day1()
    }

    @Test
    fun part1() {
        var rows = Files.readAllLines(File("src/test/resources/Day1P1.txt").toPath())
        print(day1.part1(rows))
    }

    @Test
    fun part2() {
        var rows = Files.readAllLines(File("src/test/resources/Day1P2.txt").toPath())
        print(day1.part2(rows))
    }

    @Test
    fun part2test0() {
        assertEquals(day1.part2(listOf("+1", "-2", "+3", "+1", "+1", "-2")), 2)
    }

    @Test
    fun part2Test2() {
        assertEquals(day1.part2(listOf("+3", "+3", "+4", "-2", "-4")), 10)
    }

    @Test
    fun part2Test3() {
        assertEquals(day1.part2(listOf("-6", "+3", "+8", "+5", "-6")), 5)
    }

}