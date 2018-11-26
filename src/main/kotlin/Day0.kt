package com.sorkmos.aoc2018.day0

class Day0 {

    companion object {
        fun part1(input: String): Int {

            var numbers = input.map(Character::getNumericValue)
            println("input $numbers")
            return (0 until  numbers.size)
                .filter { numbers[it] == numbers[(it+1)  % numbers.size]}
                .map {numbers[it]}
                .sum()
        }
    }

}