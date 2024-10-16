package com.gustav.bookstore.controller

import com.gustav.bookstore.domain.Author
import com.gustav.bookstore.domain.Book
import com.gustav.bookstore.repo.BookRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/book")
class BookController(
    private val bookRepository: BookRepository
)
{
    @GetMapping("/find-all")
    fun getAllBooks(): MutableList<Book> = bookRepository.findAll()

    @PostMapping("/post-new")
    fun createBook(@RequestBody book: Book): ResponseEntity<Book>{
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(bookRepository.save(book))
    }
}