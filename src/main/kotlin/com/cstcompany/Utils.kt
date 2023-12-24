package com.cstcompany

import com.cstcompany.plugins.OS
import java.util.*

private val TRUESTRING = arrayOf("YES", "TRUE", "1")
fun String.toBoolean() = this.uppercase(Locale.getDefault()) in TRUESTRING

fun getOS(prop: String?): OS {
    var os = OS.LINUX
    if (prop != null) {
        if(prop.uppercase() == "WINDOWS"){
            os = OS.WINDOWS
        }
    }

    return os
}