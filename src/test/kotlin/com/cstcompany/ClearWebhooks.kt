package com.cstcompany

fun clearWebhooks() {
    val cleanedWebhooks = webhooks.map {
        it.copy(command = "")
    }.toMutableList()

    webhooks = cleanedWebhooks
}