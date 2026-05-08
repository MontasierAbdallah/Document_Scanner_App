package com.coding.montaser.documentscannerapp

interface DocumentScanner {
    fun startScan(onResult: (List<String>) -> Unit)
}