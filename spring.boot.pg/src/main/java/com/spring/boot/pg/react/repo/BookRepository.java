package com.spring.boot.pg.react.repo;

import org.springframework.data.repository.CrudRepository;

import com.spring.boot.pg.react.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
