package com.sorkmos.aoc2018.utils

import java.io.File
import java.nio.file.Files

class Utils {

    companion object {
        fun fileToStringList(pathName: String): MutableList<String> = Files.readAllLines(File(pathName).toPath())
    }

}