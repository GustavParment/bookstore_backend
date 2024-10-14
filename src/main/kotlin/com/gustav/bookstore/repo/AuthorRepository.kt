package com.gustav.bookstore.repo

import com.gustav.bookstore.domain.Author
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import org.springframework.web.bind.annotation.RequestMapping

@Repository
interface AuthorRepository : MongoRepository<Author , Long> {
    fun findAuthorById(authorId : Long) : Author?
}