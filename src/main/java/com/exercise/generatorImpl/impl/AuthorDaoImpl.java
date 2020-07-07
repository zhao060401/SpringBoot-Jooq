package com.exercise.generatorImpl.impl;

import com.exercise.generator.tables.daos.AuthorDao;
import com.exercise.generator.tables.pojos.Author;
import org.springframework.stereotype.Service;

import static com.exercise.generator.tables.Author.AUTHOR;

@Service
public class AuthorDaoImpl extends AuthorDao {

    public Author selectById(Integer id) {
        Author author = ctx().select(AUTHOR.asterisk()).from(AUTHOR).where(AUTHOR.ID.eq(id)).fetchAnyInto(Author.class);
        return author;
    }
}
