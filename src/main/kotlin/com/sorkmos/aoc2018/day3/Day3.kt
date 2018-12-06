package com.sorkmos.aoc2018.day3

class Day3 {

    fun part1(input: List<String>): Int {
        val rectangles = extractClaims(input)
        val gridSize = 1000

        val grid = IntArray(gridSize * gridSize) { 0 }
        for (rectangle in rectangles) {
            for (y in rectangle.y1..rectangle.y2) {
                for (x in rectangle.x1..rectangle.x2) {
                    grid[x + y * gridSize] += 1
                }
            }
        }

        return grid.count { it > 1 }
    }

    private fun extractClaims(input: List<String>): List<Rectangle> {
        val regex = Regex("""#(?<id>\d+) @ (?<x>\d+),(?<y>\d+): (?<w>\d+)x(?<h>\d+)""")
        return input
            .asSequence()
            .map { regex.find(it)!! }
            .map {
                val x = it.groupValues[2].toInt()
                val y = it.groupValues[3].toInt()
                Rectangle(
                    it.groupValues[1].toInt(),
                    x,
                    y,
                    x - 1 + it.groupValues[4].toInt(),
                    y - 1 + it.groupValues[5].toInt()
                )
            }
            .toList()
    }


    fun part2(input: List<String>): Int {
        val rectangles = extractClaims(input)
        val overlaps = IntArray(rectangles.size) { rectangles[it].id }

        val gridSize = 1000

        val grid = IntArray(gridSize * gridSize) { 0 }
        for (re in rectangles) {
            for (y in re.y1..re.y2) {
                for (x in re.x1..re.x2) {
                    val idx = x + y * gridSize
                    if (grid[idx] != 0) {
                        overlaps[grid[idx] - 1] = 0
                        overlaps[re.id - 1] = 0
                    }
                    grid[idx] = re.id
                }
            }
        }

        return overlaps.find { it != 0 }!!
    }
}

private data class Rectangle(val id: Int, val x1: Int, val y1: Int, val x2: Int, val y2: Int)

