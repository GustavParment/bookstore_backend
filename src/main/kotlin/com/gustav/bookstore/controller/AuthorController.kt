package com.gustav.bookstore.controller

import com.gustav.bookstore.domain.Author
import com.gustav.bookstore.service.AuthorService
import com.gustav.bookstore.service.BookService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping
class AuthorController(
    val authorService: AuthorService,
    )
{
    @PostMapping("/authors")
    fun createAuthor(@RequestBody author: Author){
        authorService.addAuthor(author)
    }

    @GetMapping("/authors/{authorId}")
    fun getAuthorById(@PathVariable authorId: Long): Author {
        return authorService.findById(authorId);
    }

}