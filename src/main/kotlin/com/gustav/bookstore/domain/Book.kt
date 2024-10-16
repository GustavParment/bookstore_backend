package com.gustav.bookstore.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "book")
data class Book (
    @Id
    val isbn: String?,
    val title: String?,
    val description: String,
    val image: String,
    val author: Author?

)