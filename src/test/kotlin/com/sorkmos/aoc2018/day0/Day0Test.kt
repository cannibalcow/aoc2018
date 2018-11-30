package com.sorkmos.aoc2018.day0

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class Day0Test {
    @Test
    @DisplayName("1122")
    fun day0Part1Test(){
        assertEquals(Day0.part1("1122"), 3)
    }

    @Test
    @DisplayName("1111")
    fun allOnes() {
        assertEquals(Day0.part1("1111"), 4)
    }

    @Test
    @DisplayName("1234")
    fun input123() {
        assertEquals(Day0.part1("1234"), 0)
    }
}