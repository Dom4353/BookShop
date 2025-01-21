

package com.example.book.model

import jakarta.persistence.*

@Entity
@Table(name = "books")
data class Book(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val title: String,
    val author: String,
    val price: Double,
    val username: String,
    val description: String
)

