package com.sorkmos.aoc2018.utils

import java.io.File

class Utils {

    companion object {
        fun readFile(fileName: String)
                = File(fileName).readBytes()
    }

}