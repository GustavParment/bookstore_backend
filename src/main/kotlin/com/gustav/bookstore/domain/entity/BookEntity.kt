package com.gustav.bookstore.domain.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "book")
data class BookEntity (
    @Id
    val isbn: String?,
    val title: String?,
    val description: String,
    val image: String,
    val authorEntity: AuthorEntity?

)