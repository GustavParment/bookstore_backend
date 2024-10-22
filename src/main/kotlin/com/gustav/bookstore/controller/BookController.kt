package com.gustav.bookstore.controller

import com.gustav.bookstore.domain.entity.BookEntity
import com.gustav.bookstore.repo.BookRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/book")
class BookController(
    private val bookRepository: BookRepository
)
{
    @GetMapping("/find-all")
    fun getAllBooks(): MutableList<BookEntity> = bookRepository.findAll()

    @PostMapping("/post-new")
    fun createBook(@RequestBody bookEntity: BookEntity): ResponseEntity<Any>{
        return try {
            val savedBook = bookRepository.save(bookEntity)

            ResponseEntity
                .status(HttpStatus.CREATED)
                .body(bookRepository.save(savedBook))
        }catch (e: Exception){
            ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Error: Unable to save the book. ${e.message}")
        }
    }
}