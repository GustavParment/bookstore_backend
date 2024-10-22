package com.gustav.bookstore.service

import com.gustav.bookstore.domain.entity.AuthorEntity
import com.gustav.bookstore.repo.AuthorRepository
import org.springframework.stereotype.Service

@Service
interface AuthorService {
    fun save(author: AuthorEntity): AuthorEntity

}