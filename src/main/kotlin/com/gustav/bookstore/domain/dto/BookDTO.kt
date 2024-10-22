package com.gustav.bookstore.domain.dto

import com.gustav.bookstore.domain.entity.AuthorEntity
import org.springframework.data.annotation.Id

data class BookDTO(
    val isbn: String?,
    val title: String?,
    val description: String,
    val image: String,
    val author: AuthorDTO?
) {
}