package com.cstcompany

import com.cstcompany.plugins.configureRouting
import com.cstcompany.plugins.configureSerialization
import com.cstcompany.plugins.configureWebhooks
import com.typesafe.config.ConfigFactory
import generateJson
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.gson.*
import io.ktor.server.config.*
import io.ktor.server.testing.*
import kotlin.test.Test
import kotlin.test.assertEquals

class ApplicationTest {
    @Test
    fun testRoot() = testApplication {
        environment {
            config = HoconApplicationConfig(ConfigFactory.load("testApplication.conf"))
        }

        application {
            configureWebhooks()
            configureRouting()
        }

        val client = createClient {
            install(ContentNegotiation) {
                gson()
            }
        }

        client.post("/webhook"){
            contentType(ContentType.Application.Json)
            setBody(generateJson())
        }.apply {
            assertEquals(HttpStatusCode.OK, status)
        }
    }
}
