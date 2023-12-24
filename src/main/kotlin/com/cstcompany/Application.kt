package com.cstcompany

import com.cstcompany.plugins.Webhook
import com.cstcompany.plugins.configureRouting
import com.cstcompany.plugins.configureSerialization
import com.cstcompany.plugins.configureWebhooks
import io.ktor.server.application.*
import io.ktor.server.netty.*

fun main(args: Array<String>): Unit = EngineMain.main(args)

lateinit var webhooks: List<Webhook>
fun Application.module() {
    configureWebhooks()
    configureSerialization()
    configureRouting()
}
