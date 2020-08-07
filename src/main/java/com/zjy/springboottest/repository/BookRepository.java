package com.zjy.springboottest.repository;


import com.zjy.springboottest.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
