package com.gustav.bookstore.controller

import com.gustav.bookstore.domain.dto.AuthorDTO
import com.gustav.bookstore.domain.entity.AuthorEntity
import com.gustav.bookstore.service.AuthorService
import com.gustav.bookstore.toAuthorDTO
import com.gustav.bookstore.toAuthorEntity
import org.bson.types.ObjectId
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/authors")
class AuthorController(
    private val authorService: AuthorService
    )
{
    @PostMapping("/create")
    fun createAuthor(@RequestBody authorDTO: AuthorDTO):
            ResponseEntity<AuthorDTO>{
       return ResponseEntity
           .status(201)
           .body(authorService
           .save(
               authorDTO.toAuthorEntity()
           )
           .toAuthorDTO()
       )
    }

    @GetMapping("/{id}")
    fun getAuthorById(@PathVariable("id") authorId: ObjectId): ResponseEntity<AuthorEntity> {
        return ResponseEntity
            .status(200)
            .body(authorService.getById(authorId))
    }

}