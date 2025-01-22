package com.example.bookshop.repository

import com.example.bookshop.entity.Book
import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository : JpaRepository<Book, Long>
