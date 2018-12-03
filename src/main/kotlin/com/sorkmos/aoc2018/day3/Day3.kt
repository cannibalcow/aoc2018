package com.sorkmos.aoc2018.day3

import javax.swing.Spring.height


class Day3 {


    fun part1(input: List<String>): Int {
        var parsed = input.map { row -> parseRow(row) }.toList()
        println(parsed)
        var overlapArea = 0
        parsed.forEach { r1 ->
            println("${r1!!.id}")
            println(r1.pos)
            parsed.forEach { r2 ->
                if (r1.id !== r2!!.id) {
                    if (rectIntersects(r1!!, r2!!)) {
                        println("\t overlaps with ${r2.id}")
                        overlapArea += overlapArea(r1, r2)
                    }
                }
            }
        }
        return overlapArea
    }

    fun overlapArea(r1: InputItem, r2: InputItem): Int {
        val newX = Math.max(r1.posX, r2.posX)
        val newY = Math.max(r1.posY, r2.posY)
        println("x: $newX y: $newY");
        val newWidth = Math.min(r1.posX + r1.sizeX, r2.posX + r2.sizeX) - newX
        val newHeight = Math.min(r1.posY + r1.sizeY, r2.posY + r2.sizeY) - newY
        if (newWidth <= 0.0 || newHeight <= 0.0)
            return 0

        println("w: $newWidth h: $newHeight")
        val inp = InputItem(666, newX, newY, newWidth, newHeight)
        println("ninp: $inp")
        println("npos: ${inp.pos} area: ${inp.area}")
        return newWidth * newHeight
    }

    fun parseRow(str: String): InputItem? {
        val r = "\\#([0-9]+) @ ([0-9]+),([0-9]+): ([0-9]+)x([0-9]+)".toRegex()
        var result = r.matchEntire(str)
        return InputItem(result!!.groupValues[1].toInt(), result.groupValues[2].toInt(), result.groupValues[3].toInt(), result.groupValues[4].toInt(), result.groupValues[5].toInt())
    }

    fun rectIntersects(r1: InputItem, r2: InputItem): Boolean {
        if (r1.id == r2.id) return false
        if (r1.topRightY <= r2.bottomLeftY || r1.bottomLeftY >= r2.topRightY)
            return false;

        if (r1.topRightX <= r2.bottomLeftX || r1.bottomLeftX >= r2.topRightX)
            return false

        return true
    }
}

data class InputItem(val id: Int, val posX: Int, val posY: Int, val sizeX: Int, val sizeY: Int) {
    val topRightX: Int get() = this.posX + this.sizeX
    val topRightY: Int get() = this.posY
    val topLeftX: Int get() = this.posX
    val topLeftY: Int get() = this.posY
    val bottomRightX: Int get() = this.posX + this.sizeX
    val bottomRightY: Int get() = this.posY - this.sizeY
    val bottomLeftY: Int get() = this.posY - this.sizeY
    val bottomLeftX: Int get() = this.posX

    val pos = "($topLeftX, $topLeftY), ($topRightX, $topRightY), ($bottomLeftX, $bottomLeftY), ($bottomRightX, $bottomRightY)"
    val area = sizeX * sizeY
}
