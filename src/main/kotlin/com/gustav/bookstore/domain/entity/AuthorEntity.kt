package com.gustav.bookstore.domain.entity


import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "author")
data class AuthorEntity(
    @Id
    val id: ObjectId? = ObjectId(),
    val name: String,
    val age: Int,
    val description: String,
    val image: String,
    )

