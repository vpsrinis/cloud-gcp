package com.springboot.undertow.pgsql.repo;

import org.springframework.data.repository.CrudRepository;

import com.springboot.undertow.pgsql.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
