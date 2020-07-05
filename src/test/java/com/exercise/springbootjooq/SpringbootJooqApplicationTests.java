package com.exercise.springbootjooq;

import com.exercise.generator.tables.pojos.Author;
import com.exercise.service.AuthorService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
class SpringbootJooqApplicationTests {

    @Autowired
    private AuthorService authorService;
    @Test
    void contextLoads() {
        log.info("1223");
        Author author = authorService.selectById(1);
        log.info("结果：{}",author);
    }


}
