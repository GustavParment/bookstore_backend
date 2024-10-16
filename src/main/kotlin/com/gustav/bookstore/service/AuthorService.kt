package com.gustav.bookstore.service

import com.gustav.bookstore.domain.Author
import com.gustav.bookstore.repo.AuthorRepository
import org.springframework.stereotype.Service

@Service
class AuthorService(private val authorRepository: AuthorRepository) {
    fun findAll(): List<Author> = authorRepository.findAll()

    fun findById(id: Long): Author{
        return authorRepository.findById(id).orElse(null)
    }

    fun addAuthor(author: Author):Author {
       return authorRepository.save(author)
    }

}