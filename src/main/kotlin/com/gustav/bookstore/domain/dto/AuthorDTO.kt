package com.gustav.bookstore.domain.dto

import org.bson.types.ObjectId

data class AuthorDTO(
    val id: ObjectId? = ObjectId(),
    val name: String,
    val age: Int,
    val description: String,
    val image: String,
) {
}