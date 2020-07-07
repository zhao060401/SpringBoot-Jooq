package com.exercise.service.Impl;

import static com.exercise.generator.tables.Author.AUTHOR;

import com.exercise.generator.tables.daos.AuthorDao;
import com.exercise.generator.tables.pojos.Author;
import com.exercise.generatorImpl.impl.AuthorDaoImpl;
import com.exercise.service.AuthorService;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("authorService")
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    DSLContext dsl;

    @Autowired
    AuthorDaoImpl authorDao;

    @Autowired
    public void setAuthorDao() {
        authorDao.setConfiguration(dsl.configuration());
    }

    @Override
    public Author selectById(Integer id) {
        return  authorDao.selectById(id);
    }

    @Override
    public Author fetchById(Integer value) {
        return authorDao.fetchOneById(value);
    }
}
