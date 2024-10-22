package com.gustav.bookstore.service

import com.gustav.bookstore.domain.entity.AuthorEntity
import com.gustav.bookstore.repo.AuthorRepository
import org.bson.types.ObjectId
import org.springframework.stereotype.Service

@Service
interface AuthorService {
    fun save(author: AuthorEntity): AuthorEntity

    fun list(): List<AuthorEntity>

    fun getById(id: ObjectId): AuthorEntity?

}