package com.sorkmos.aoc2018.day2


class Day2 {

    fun part1(input: List<String>): Int {
        var threes = 0
        var twos = 0

        input.forEach { item ->
            var y = item.groupBy { it }.map { v -> v }.groupBy { it.value.size }

            if (y.containsKey(3) && y.containsKey(2)) {
                threes++
                twos++
            } else if (y.containsKey(3)) {
                threes++
            } else if (y.containsKey(2)) {
                twos++
            }
        }
        println("$threes *  $twos = ${threes * twos}")
        return threes * twos
    }

    fun part2(input: List<String>): String {

        input.forEach { v ->
            val result = findClose(v, input)

            if (result != null) {
                return result
            }
        }
        return "not found"
    }

    private fun findClose(v: String, input: List<String>): String? {
        input.forEach { target ->
            var hit = 0
            if (target != v) {
                v.forEachIndexed { i, c ->
                    if (target[i] == c) {
                        hit++
                    }
                }
                println("hits: $hit $v -> $target")
                if (hit == v.length - 1) {
                    val mergeResult = mergeResult(v, target)
                    print("found: $v -> $target merging into -> $mergeResult")
                    return mergeResult
                }
            }
        }
        return null
    }

    private fun mergeResult(v: String, target: String): String {
        var result = mutableListOf<Char>()
        v.forEachIndexed { i, c ->
            if (c == target[i]) {
                result.add(c)
            }
        }
        return result.joinToString("")
    }
}