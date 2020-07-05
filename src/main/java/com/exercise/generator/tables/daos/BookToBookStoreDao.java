/*
 * This file is generated by jOOQ.
 */
package com.exercise.generator.tables.daos;


import com.exercise.generator.tables.BookToBookStore;
import com.exercise.generator.tables.records.BookToBookStoreRecord;

import java.util.List;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BookToBookStoreDao extends DAOImpl<BookToBookStoreRecord, com.exercise.generator.tables.pojos.BookToBookStore, Record2<String, Integer>> {

    /**
     * Create a new BookToBookStoreDao without any configuration
     */
    public BookToBookStoreDao() {
        super(BookToBookStore.BOOK_TO_BOOK_STORE, com.exercise.generator.tables.pojos.BookToBookStore.class);
    }

    /**
     * Create a new BookToBookStoreDao with an attached configuration
     */
    public BookToBookStoreDao(Configuration configuration) {
        super(BookToBookStore.BOOK_TO_BOOK_STORE, com.exercise.generator.tables.pojos.BookToBookStore.class, configuration);
    }

    @Override
    public Record2<String, Integer> getId(com.exercise.generator.tables.pojos.BookToBookStore object) {
        return compositeKeyRecord(object.getBookStoreName(), object.getBookId());
    }

    /**
     * Fetch records that have <code>book_store_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.exercise.generator.tables.pojos.BookToBookStore> fetchRangeOfBookStoreName(String lowerInclusive, String upperInclusive) {
        return fetchRange(BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_STORE_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>book_store_name IN (values)</code>
     */
    public List<com.exercise.generator.tables.pojos.BookToBookStore> fetchByBookStoreName(String... values) {
        return fetch(BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_STORE_NAME, values);
    }

    /**
     * Fetch records that have <code>book_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.exercise.generator.tables.pojos.BookToBookStore> fetchRangeOfBookId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>book_id IN (values)</code>
     */
    public List<com.exercise.generator.tables.pojos.BookToBookStore> fetchByBookId(Integer... values) {
        return fetch(BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_ID, values);
    }

    /**
     * Fetch records that have <code>stock BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.exercise.generator.tables.pojos.BookToBookStore> fetchRangeOfStock(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(BookToBookStore.BOOK_TO_BOOK_STORE.STOCK, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>stock IN (values)</code>
     */
    public List<com.exercise.generator.tables.pojos.BookToBookStore> fetchByStock(Integer... values) {
        return fetch(BookToBookStore.BOOK_TO_BOOK_STORE.STOCK, values);
    }
}