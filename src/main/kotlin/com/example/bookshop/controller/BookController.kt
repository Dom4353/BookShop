package com.example.bookshop.controller

import com.example.bookshop.entity.Book
import com.example.bookshop.service.BookService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/books")
class BookController(private val bookService: BookService) {
    @GetMapping
    fun listBooks(): List<Book> = bookService.listAllBooks()

    @PostMapping
    fun addBook(@RequestBody book: Book): Book = bookService.addBook(book)
}
