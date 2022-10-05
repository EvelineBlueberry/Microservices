package com.kirars.book.controller;

import com.kirars.book.model.Book;
import com.kirars.book.service.BookService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    @PostMapping("/")
    public Book saveBook(@RequestBody Book book) {
        log.info("Inside saveBook method in BookController");
        return bookService.saveBook(book);
    }

    @GetMapping("/{bookId}")
    public Book findBookById(@PathVariable Long bookId) {
        log.info("Inside findBookById method in BookController");
        return bookService.findBookById(bookId);
    }
}
