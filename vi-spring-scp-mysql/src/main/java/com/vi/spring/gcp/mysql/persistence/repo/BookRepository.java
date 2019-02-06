package com.vi.spring.gcp.mysql.persistence.repo;

import org.springframework.data.repository.CrudRepository;

import com.vi.spring.gcp.mysql.persistence.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
