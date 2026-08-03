package com.mahmoud.complexfeature

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform