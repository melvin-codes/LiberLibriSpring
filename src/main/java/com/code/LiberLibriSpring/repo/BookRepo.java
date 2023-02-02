package com.code.LiberLibriSpring.repo;

import com.code.LiberLibriSpring.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface BookRepo extends JpaRepository<Book, Long> {
    void deleteBookById(Long id);

    Optional<Book> getBookById(Long id);
}
