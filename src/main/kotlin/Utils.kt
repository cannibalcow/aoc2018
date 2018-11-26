package com.sorkmos.aoc2018.day0

import java.io.File

class Utils {

    fun readFile(fileName: String)
        = File(fileName).readBytes()
}