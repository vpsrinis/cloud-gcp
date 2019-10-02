package com.springboot.undertow.pgsql.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class BookServiceImpl {
	
	@HystrixCommand(fallbackMethod = "defaultGetBook")
    public String getBook(Long id) {
        return new RestTemplate()
          .getForObject("http://localhost:8080/api/books/{id}", 
          String.class, id);
    }
  
    private String defaultGetBook(Long id) {
        return "Hello No Book!";
    }

}
