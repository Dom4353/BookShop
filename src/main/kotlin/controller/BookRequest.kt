package com.example.bookshop

data class BookRequest(
    val title: String,
    val author: String,
    val price: Double,
    val username: String,
    val description: String
)
