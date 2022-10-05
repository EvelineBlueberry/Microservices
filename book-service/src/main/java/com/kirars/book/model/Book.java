package com.kirars.book.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookId;

    private String bookTitle;
    private String bookGenre;

}
