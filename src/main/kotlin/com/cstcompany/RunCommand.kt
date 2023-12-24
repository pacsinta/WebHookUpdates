package com.cstcompany

import com.cstcompany.plugins.OS

fun runCommand(cmd: String, async: Boolean, timeoutSeconds: Int, os: OS) {
    val command = mutableListOf<String>()
    if(os == OS.WINDOWS) {
        command.add("cmd")
        command.add("/c")
    }

    command.add(cmd)
    val process = ProcessBuilder(command)
        .redirectOutput(ProcessBuilder.Redirect.INHERIT)
        .redirectError(ProcessBuilder.Redirect.INHERIT)
        .start()

    if(!async) {
        process.waitFor(
            timeoutSeconds.toLong(),
            java.util.concurrent.TimeUnit.SECONDS
        )
    }
}