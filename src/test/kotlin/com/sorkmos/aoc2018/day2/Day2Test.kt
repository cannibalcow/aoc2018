package com.sorkmos.aoc2018.day2

import com.sorkmos.aoc2018.day1.Day1
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.File
import java.nio.file.Files

internal class Day2Test {

    private lateinit var d2: Day2

    @BeforeEach
    fun setup() {
        d2 = Day2()
    }

    @Test
    fun day2p1() {
        val rows = Files.readAllLines(File("src/test/resources/Day2P1.txt").toPath())
        print(d2.part1(rows))
    }


    @Test
    fun day2p1test0() {
        assertEquals(d2.part1(listOf("abcdef", "bababc", "abbcde", "abcccd", "aabcdd", "abcdee", "ababab")), 12)
    }

    @Test
    fun day2p1test1() {
        assertEquals(d2.part1(listOf("abcdef", "bbbaa", "aabcd")), 2)
    }


    @Test
    fun day2p2test() {
        val rows = Files.readAllLines(File("src/test/resources/Day2P2.txt").toPath())
        d2.part2(rows)
    }

    @Test
    fun Day2p2exampleTest() {
        val input = arrayListOf("abcde", "fghij", "klmno", "pqrst", "fguij", "axcye", "wvxyz")
        d2.part2(input)
    }


}