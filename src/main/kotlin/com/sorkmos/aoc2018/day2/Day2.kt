package com.sorkmos.aoc2018.day2

class Day2 {

    fun part1(input: List<String>): Int {
        var threes = 0;
        var twos = 0

        input.forEach { item ->
            var y = item.groupBy { it }.map { v -> v }.groupBy { it.value.size }

            if(y.containsKey(3) && y.containsKey(2)) {
                threes++
                twos++
            } else if(y.containsKey(3)) {
                threes++
            } else if(y.containsKey(2)) {
                twos++
            }
        }
        println("$threes *  $twos = ${threes * twos}")
        return threes * twos
    }
}