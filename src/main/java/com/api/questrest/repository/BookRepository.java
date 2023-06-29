package com.api.questrest.repository;

import com.api.questrest.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository  extends JpaRepository<Book, Long> {
    List<Book> findByTitleContainingOrAuthorContaining(String text, String textAgain);
}
