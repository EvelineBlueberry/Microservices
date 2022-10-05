package com.kirars.book.service;

import com.kirars.book.model.Book;
import com.kirars.book.repository.BookRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class BookService {
    private final BookRepository bookRepository;

    public Book saveBook(Book book) {
        log.info("Inside saveBook in BookService");
        return bookRepository.save(book);
    }

    public Book findBookById(Long bookId) {
        log.info("Inside findBookById in BookService");
        return bookRepository.findByBookId(bookId);
    }
}
