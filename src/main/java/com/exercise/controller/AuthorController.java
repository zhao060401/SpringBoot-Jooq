package com.exercise.controller;

import com.exercise.generator.tables.pojos.Author;
import com.exercise.service.AuthorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping("/test/{id}")
    public Author getById(@PathVariable Integer id){
        log.info("进入");
        Author author = authorService.selectById(id);
        return author;
    }
}
