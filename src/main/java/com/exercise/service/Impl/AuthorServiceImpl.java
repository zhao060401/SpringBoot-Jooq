package com.exercise.service.Impl;

import static com.exercise.generator.tables.Author.AUTHOR;

import com.exercise.generator.tables.daos.AuthorDao;
import com.exercise.generator.tables.pojos.Author;
import com.exercise.service.AuthorService;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("authorService")
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    DSLContext dsl;

    @Autowired
    AuthorDao authorDao;

    @Autowired
    public void setAuthorDao() {
        authorDao.setConfiguration(dsl.configuration());
    }

    @Override
    public Author selectById(Integer id) {
        Author author = dsl.select(AUTHOR.asterisk()).from(AUTHOR).where(AUTHOR.ID.eq(id)).fetchAnyInto(Author.class);
        return author;
    }

    @Override
    public Author fetchById(Integer value) {
        return authorDao.fetchOneById(value);
    }
}
