package com.example.bookshop.entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
data class Rent(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @ManyToOne
    @JoinColumn(name = "user_id")
    val user: User,

    @ManyToOne
    @JoinColumn(name = "book_id")
    val book: Book,

    val rentDate: LocalDate = LocalDate.now(),
    val returnDate: LocalDate? = null
)
