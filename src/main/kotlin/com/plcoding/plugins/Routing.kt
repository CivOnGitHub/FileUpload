package com.plcoding.plugins

import com.plcoding.routes.root
import com.plcoding.routes.uploadFile
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        root()
        uploadFile()
    }
}