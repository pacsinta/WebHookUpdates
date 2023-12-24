package com.cstcompany

import com.cstcompany.plugins.*
import io.ktor.server.application.*
import io.ktor.server.netty.*

fun main(args: Array<String>): Unit = EngineMain.main(args)

lateinit var webhooks: List<Webhook>
fun Application.module() {
    configureWebhooks()
    configureSerialization()
    configureRouting()
}
