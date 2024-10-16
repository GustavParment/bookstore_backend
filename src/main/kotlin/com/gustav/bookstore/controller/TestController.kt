package com.gustav.bookstore.controller

import com.gustav.bookstore.domain.Author
import com.gustav.bookstore.repo.AuthorRepository
import com.gustav.bookstore.service.AuthorService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping
class TestController(val authorService: AuthorService) {


    @PostMapping("/test-post")
    fun testSaveAuthor(): Author {
        val testAuthor = Author(
            5,
            "Test Author",
            25,
            "ett test",
            "test.jpg")

        return  authorService.addAuthor(testAuthor)
    }
    @GetMapping("/test-get")
    fun testGetAuthor(): List<Author> {
        return authorService.findAll()
    }


}