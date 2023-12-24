package com.cstcompany.plugins

import com.cstcompany.toBoolean
import com.cstcompany.webhooks
import io.ktor.server.application.*

data class Webhook(
    val url: String,
    val repo: String,
    val command: String,
    val async: Boolean = false,
    val timeoutSeconds: Int = 10
){
    constructor(repo: String, command: String) : this(repo, repo, command)
}
fun Application.configureWebhooks() {
    val cfg = environment.config.config("ktor").configList("webhooks")

    webhooks = cfg.map {
        if(!it.keys().contains("repo") || !it.keys().contains("command")) {
            throw Exception("Webhook config must contain repo and command")
        }

        var webhook = Webhook(
            it.property("repo").getString(),
            it.property("command").getString()
        )

        if(it.keys().contains("url")) {
            webhook = webhook.copy(url = it.property("url").getString())
        }
        if(it.keys().contains("async")) {
            webhook = webhook.copy(async = it.property("async").getString().toBoolean())
        }
        if(it.keys().contains("timeoutSeconds")) {
            webhook = webhook.copy(timeoutSeconds = it.property("timeoutSeconds").getString().toInt())
        }


        webhook
    }
}