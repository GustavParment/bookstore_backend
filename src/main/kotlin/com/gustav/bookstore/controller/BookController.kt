package com.gustav.bookstore.controller

import com.gustav.bookstore.domain.Author
import com.gustav.bookstore.domain.Book
import com.gustav.bookstore.repo.BookRepository
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
    fun createBook(book: Book){
        val testBook =
            Book("123",
            "Test Name",
            "Test Description",
            "Test img.jpg",
            Author(1,
                "Test Name",
                25,
                "Test Description",
                "Test img.jpg"),
            )
        bookRepository.save(testBook)
    }
}