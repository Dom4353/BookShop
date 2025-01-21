

package com.example.bookshop.controller

import com.example.book.model.Book
import com.example.bookshop.BookRequest
import com.example.bookshop.repository.BookRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/books")
class BookshopController(private val bookRepository: BookRepository) {

    @PostMapping
    fun addBook(@RequestBody bookRequest: BookRequest):Book {
        val book = Book(
            title = bookRequest.title,
            author = bookRequest.author,
            price = bookRequest.price,
            username = bookRequest.username,
            description = bookRequest.description
        )
        return bookRepository.save(book)
    }

    @GetMapping
    fun listBooks(): List<Book> = bookRepository.findAll()
}
