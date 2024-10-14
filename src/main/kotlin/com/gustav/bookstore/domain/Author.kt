package com.gustav.bookstore.domain


import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.MongoId

@Document(collation = "author")
data class Author(
    @Id
    val id: Long?,
    val name: String,
    val age: Int,
    val description: String,
    val image: String,
    )

