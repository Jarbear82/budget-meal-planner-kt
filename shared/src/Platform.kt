package io.github.jarbear82

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
