package com.gustav.bookstore.service.impl

import com.gustav.bookstore.domain.entity.AuthorEntity
import com.gustav.bookstore.repo.AuthorRepository
import com.gustav.bookstore.service.AuthorService
import org.springframework.stereotype.Service

@Service
class AuthorServiceImpl(
    private val authorRepository: AuthorRepository
)
    : AuthorService {
    override fun save(author: AuthorEntity): AuthorEntity {
        return authorRepository.save(author)
    }
}