package com.gustav.bookstore.repo

import com.gustav.bookstore.domain.entity.AuthorEntity
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface AuthorRepository : MongoRepository<AuthorEntity, ObjectId?> {

}