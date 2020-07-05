package com.exercise.service;

import com.exercise.generator.tables.pojos.Author;

public interface AuthorService {
    public Author selectById(Integer id);
}
