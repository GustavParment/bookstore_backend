package com.gustav.bookstore.service.impl

import com.gustav.bookstore.domain.entity.AuthorEntity
import com.gustav.bookstore.repo.AuthorRepository
import com.gustav.bookstore.service.AuthorService
import com.gustav.bookstore.toAuthorDTO
import org.bson.types.ObjectId
import org.springframework.stereotype.Service

@Service
class AuthorServiceImpl(
    private val authorRepository: AuthorRepository
)
    : AuthorService {
    override fun save(author: AuthorEntity): AuthorEntity {
        return authorRepository.save(author)
    }

    override fun list(): List<AuthorEntity> {
        return authorRepository.findAll()
    }

    override fun getById(id: ObjectId): AuthorEntity? {
        return authorRepository.findById(id).orElse(null)
    }
}