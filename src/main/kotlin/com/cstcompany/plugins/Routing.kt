package com.cstcompany.plugins

import WebhookDTO
import com.cstcompany.getOS
import com.cstcompany.runCommand
import com.cstcompany.webhooks
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

enum class OS {
    WINDOWS,
    LINUX
}

fun Application.configureRouting() {
    val os: OS = getOS(environment.config.propertyOrNull("ktor.deployment.os")?.getString())

    routing {
        for (webhook in webhooks) {
            post(webhook.url) {
                val request = call.receive<WebhookDTO>()
                if(request.repository.name != webhook.repo) {
                    call.response.status(HttpStatusCode.BadRequest)
                    call.respondText("Repository name does not match")
                    return@post
                }

                if(webhook.command.isNotEmpty())
                {
                    runCommand(webhook.command, webhook.async, webhook.timeoutSeconds, os)
                }

                call.response.status(HttpStatusCode.OK)
                call.respondText("OK")
            }
        }
    }
}
