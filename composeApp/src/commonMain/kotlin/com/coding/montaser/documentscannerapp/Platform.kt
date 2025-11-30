package com.coding.montaser.documentscannerapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform