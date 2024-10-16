package com.gustav.bookstore.service

import com.gustav.bookstore.domain.Book
import com.gustav.bookstore.repo.BookRepository
import com.sun.source.tree.LambdaExpressionTree.BodyKind
import org.springframework.stereotype.Service

@Service
class BookService(private val bookRepository: BookRepository) {
    fun addBook(book: Book) {
        bookRepository.save(book)
    }

    fun getBook(bookId: String): Book {
        return bookRepository.findById(bookId).get()
    }
}