package com.zjy.springboottest;

import com.zjy.springboottest.entity.Book;
import com.zjy.springboottest.repository.BookRepository;
import net.minidev.json.JSONUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringboottestApplicationTests {

    @Autowired
    private BookRepository repository;

    @Test
    void contextLoads() {
    }

    @Test
    void save(){
        Book book = new Book();
        book.setName("Spring boot");
        book.setAuthor("zjy");
        Book book1 = repository.save(book);
        System.out.println(book1);
    }

    @Test
    void findById(){
        Book book = repository.findById(1).get();
        System.out.println(book);
    }

    @Test
    void update(){
        Book book = new Book();
        book.setId(20);
        book.setName("test test");
        Book book1 = repository.save(book);
        System.out.println(book1);
    }

    @Test
    void delete(){
        repository.deleteById(20);
    }
}
