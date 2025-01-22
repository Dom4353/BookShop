

package com.example.bookshop.service

import com.example.bookshop.entity.Book
import com.example.bookshop.repository.BookRepository
import org.springframework.stereotype.Service

@Service
class BookService(private val bookRepository: BookRepository) {
    fun listAllBooks(): List<Book> = bookRepository.findAll()

    fun addBook(book: Book): Book = bookRepository.save(book)
}
