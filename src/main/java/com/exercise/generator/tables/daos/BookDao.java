/*
 * This file is generated by jOOQ.
 */
package com.exercise.generator.tables.daos;


import com.exercise.generator.tables.Book;
import com.exercise.generator.tables.records.BookRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BookDao extends DAOImpl<BookRecord, com.exercise.generator.tables.pojos.Book, Integer> {

    /**
     * Create a new BookDao without any configuration
     */
    public BookDao() {
        super(Book.BOOK, com.exercise.generator.tables.pojos.Book.class);
    }

    /**
     * Create a new BookDao with an attached configuration
     */
    public BookDao(Configuration configuration) {
        super(Book.BOOK, com.exercise.generator.tables.pojos.Book.class, configuration);
    }

    @Override
    public Integer getId(com.exercise.generator.tables.pojos.Book object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.exercise.generator.tables.pojos.Book> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Book.BOOK.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.exercise.generator.tables.pojos.Book> fetchById(Integer... values) {
        return fetch(Book.BOOK.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.exercise.generator.tables.pojos.Book fetchOneById(Integer value) {
        return fetchOne(Book.BOOK.ID, value);
    }

    /**
     * Fetch records that have <code>author_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.exercise.generator.tables.pojos.Book> fetchRangeOfAuthorId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Book.BOOK.AUTHOR_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>author_id IN (values)</code>
     */
    public List<com.exercise.generator.tables.pojos.Book> fetchByAuthorId(Integer... values) {
        return fetch(Book.BOOK.AUTHOR_ID, values);
    }

    /**
     * Fetch records that have <code>co_author_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.exercise.generator.tables.pojos.Book> fetchRangeOfCoAuthorId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Book.BOOK.CO_AUTHOR_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>co_author_id IN (values)</code>
     */
    public List<com.exercise.generator.tables.pojos.Book> fetchByCoAuthorId(Integer... values) {
        return fetch(Book.BOOK.CO_AUTHOR_ID, values);
    }

    /**
     * Fetch records that have <code>details_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.exercise.generator.tables.pojos.Book> fetchRangeOfDetailsId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Book.BOOK.DETAILS_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>details_id IN (values)</code>
     */
    public List<com.exercise.generator.tables.pojos.Book> fetchByDetailsId(Integer... values) {
        return fetch(Book.BOOK.DETAILS_ID, values);
    }

    /**
     * Fetch records that have <code>title BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.exercise.generator.tables.pojos.Book> fetchRangeOfTitle(String lowerInclusive, String upperInclusive) {
        return fetchRange(Book.BOOK.TITLE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>title IN (values)</code>
     */
    public List<com.exercise.generator.tables.pojos.Book> fetchByTitle(String... values) {
        return fetch(Book.BOOK.TITLE, values);
    }

    /**
     * Fetch records that have <code>published_in BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.exercise.generator.tables.pojos.Book> fetchRangeOfPublishedIn(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Book.BOOK.PUBLISHED_IN, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>published_in IN (values)</code>
     */
    public List<com.exercise.generator.tables.pojos.Book> fetchByPublishedIn(Integer... values) {
        return fetch(Book.BOOK.PUBLISHED_IN, values);
    }

    /**
     * Fetch records that have <code>language_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.exercise.generator.tables.pojos.Book> fetchRangeOfLanguageId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Book.BOOK.LANGUAGE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>language_id IN (values)</code>
     */
    public List<com.exercise.generator.tables.pojos.Book> fetchByLanguageId(Integer... values) {
        return fetch(Book.BOOK.LANGUAGE_ID, values);
    }

    /**
     * Fetch records that have <code>content_text BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.exercise.generator.tables.pojos.Book> fetchRangeOfContentText(String lowerInclusive, String upperInclusive) {
        return fetchRange(Book.BOOK.CONTENT_TEXT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>content_text IN (values)</code>
     */
    public List<com.exercise.generator.tables.pojos.Book> fetchByContentText(String... values) {
        return fetch(Book.BOOK.CONTENT_TEXT, values);
    }

    /**
     * Fetch records that have <code>content_pdf BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.exercise.generator.tables.pojos.Book> fetchRangeOfContentPdf(byte[] lowerInclusive, byte[] upperInclusive) {
        return fetchRange(Book.BOOK.CONTENT_PDF, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>content_pdf IN (values)</code>
     */
    public List<com.exercise.generator.tables.pojos.Book> fetchByContentPdf(byte[]... values) {
        return fetch(Book.BOOK.CONTENT_PDF, values);
    }

    /**
     * Fetch records that have <code>rec_version BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.exercise.generator.tables.pojos.Book> fetchRangeOfRecVersion(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Book.BOOK.REC_VERSION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>rec_version IN (values)</code>
     */
    public List<com.exercise.generator.tables.pojos.Book> fetchByRecVersion(Integer... values) {
        return fetch(Book.BOOK.REC_VERSION, values);
    }

    /**
     * Fetch records that have <code>rec_timestamp BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.exercise.generator.tables.pojos.Book> fetchRangeOfRecTimestamp(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Book.BOOK.REC_TIMESTAMP, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>rec_timestamp IN (values)</code>
     */
    public List<com.exercise.generator.tables.pojos.Book> fetchByRecTimestamp(LocalDateTime... values) {
        return fetch(Book.BOOK.REC_TIMESTAMP, values);
    }
}