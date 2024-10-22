package com.gustav.bookstore.controller

import com.gustav.bookstore.domain.dto.AuthorDTO
import com.gustav.bookstore.domain.entity.AuthorEntity
import com.gustav.bookstore.service.AuthorService
import com.gustav.bookstore.toAuthorDTO
import com.gustav.bookstore.toAuthorEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/authors")
class AuthorController(
    private val authorService: AuthorService
    )
{
    @PostMapping("/create")
    fun createAuthor(@RequestBody authorDTO: AuthorDTO): AuthorDTO{
       return authorService
           .save(
               authorDTO.toAuthorEntity()
           )
           .toAuthorDTO()
    }

//    @GetMapping("/authors/{authorId}")
//    fun getAuthorById(@PathVariable authorId: Long): AuthorEntity {
//        return authorService.findById(authorId);
//    }

}