package com.gustav.bookstore.model

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "user")
data class User(
    @Id var id: Long?,
    val username: String,
    val password: String,
    val email: String

) {
}