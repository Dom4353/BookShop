package com.example.bookshop.entity

import jakarta.persistence.*

@Entity
data class Book(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val title: String,ad
    val author: String,
    val price: Double,
    val available: Boolean = true
)
