package com.gustav.bookstore

import com.gustav.bookstore.domain.dto.*
import com.gustav.bookstore.domain.entity.*

fun AuthorEntity.toAuthorDTO() = AuthorDTO (
        id = this.id,
        name = this.name,
        age = this.age,
        description = this.description,
        image = this.image
)

fun AuthorDTO.toAuthorEntity() = AuthorEntity (
    id = this.id,
    name = this.name,
    age = this.age,
    description = this.description,
    image = this.image
)