package com.vi.spring.gcp.mysql.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vi.spring.gcp.mysql.persistence.model.Book;
import com.vi.spring.gcp.mysql.persistence.repo.BookRepository;

@Controller
@RestController
public class SimpleController {
    @Value("${spring.application.name}")
    String appName;
    
    @Autowired
    private BookRepository bookRepository;
    
    @GetMapping
    @RequestMapping("/api/allbooks")
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
