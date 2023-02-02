package com.code.LiberLibriSpring.service;

import com.code.LiberLibriSpring.exception.BookNotFoundException;
import com.code.LiberLibriSpring.model.Book;
import com.code.LiberLibriSpring.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepo bookRepo;

    @Autowired
    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public Book addBook(Book book) {

        return bookRepo.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public Book updateBook(Book book) {
        return bookRepo.save(book);
    }

    public Book getBookById(Long id) {
        return bookRepo.getBookById(id).orElseThrow(() -> new  BookNotFoundException("Book by id " + id + " was not found"));
    }

    public void deleteBook(Long id) {
        bookRepo.deleteBookById(id);
    }
}
