package com.gustav.bookstore.service.impl

import com.gustav.bookstore.domain.entity.BookEntity
import com.gustav.bookstore.repo.BookRepository
import org.springframework.stereotype.Service

@Service
class BookServiceImpl(private val bookRepository: BookRepository) {
    fun addBook(bookEntity: BookEntity) {
        bookRepository.save(bookEntity)
    }

    fun getBook(bookId: String): BookEntity {
        return bookRepository.findById(bookId).get()
    }
}