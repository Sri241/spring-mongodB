package com.wipro.velocity.bookstore.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wipro.velocity.bookstore.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {

	
}
