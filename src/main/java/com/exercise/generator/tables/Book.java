/*
 * This file is generated by jOOQ.
 */
package com.exercise.generator.tables;


import com.exercise.generator.Keys;
import com.exercise.generator.Test;
import com.exercise.generator.tables.records.BookRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Book extends TableImpl<BookRecord> {

    private static final long serialVersionUID = 185700715;

    /**
     * The reference instance of <code>test.book</code>
     */
    public static final Book BOOK = new Book();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BookRecord> getRecordType() {
        return BookRecord.class;
    }

    /**
     * The column <code>test.book.id</code>.
     */
    public final TableField<BookRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>test.book.author_id</code>.
     */
    public final TableField<BookRecord, Integer> AUTHOR_ID = createField(DSL.name("author_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>test.book.co_author_id</code>.
     */
    public final TableField<BookRecord, Integer> CO_AUTHOR_ID = createField(DSL.name("co_author_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>test.book.details_id</code>.
     */
    public final TableField<BookRecord, Integer> DETAILS_ID = createField(DSL.name("details_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>test.book.title</code>.
     */
    public final TableField<BookRecord, String> TITLE = createField(DSL.name("title"), org.jooq.impl.SQLDataType.VARCHAR(400).nullable(false), this, "");

    /**
     * The column <code>test.book.published_in</code>.
     */
    public final TableField<BookRecord, Integer> PUBLISHED_IN = createField(DSL.name("published_in"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>test.book.language_id</code>.
     */
    public final TableField<BookRecord, Integer> LANGUAGE_ID = createField(DSL.name("language_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>test.book.content_text</code>.
     */
    public final TableField<BookRecord, String> CONTENT_TEXT = createField(DSL.name("content_text"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>test.book.content_pdf</code>.
     */
    public final TableField<BookRecord, byte[]> CONTENT_PDF = createField(DSL.name("content_pdf"), org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * The column <code>test.book.rec_version</code>.
     */
    public final TableField<BookRecord, Integer> REC_VERSION = createField(DSL.name("rec_version"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>test.book.rec_timestamp</code>.
     */
    public final TableField<BookRecord, LocalDateTime> REC_TIMESTAMP = createField(DSL.name("rec_timestamp"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * Create a <code>test.book</code> table reference
     */
    public Book() {
        this(DSL.name("book"), null);
    }

    /**
     * Create an aliased <code>test.book</code> table reference
     */
    public Book(String alias) {
        this(DSL.name(alias), BOOK);
    }

    /**
     * Create an aliased <code>test.book</code> table reference
     */
    public Book(Name alias) {
        this(alias, BOOK);
    }

    private Book(Name alias, Table<BookRecord> aliased) {
        this(alias, aliased, null);
    }

    private Book(Name alias, Table<BookRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Book(Table<O> child, ForeignKey<O, BookRecord> key) {
        super(child, key, BOOK);
    }

    @Override
    public Schema getSchema() {
        return Test.TEST;
    }

    @Override
    public UniqueKey<BookRecord> getPrimaryKey() {
        return Keys.KEY_BOOK_PRIMARY;
    }

    @Override
    public List<UniqueKey<BookRecord>> getKeys() {
        return Arrays.<UniqueKey<BookRecord>>asList(Keys.KEY_BOOK_PRIMARY);
    }

    @Override
    public List<ForeignKey<BookRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BookRecord, ?>>asList(Keys.FK_T_BOOK_AUTHOR_ID, Keys.FK_T_BOOK_CO_AUTHOR_ID);
    }

    public Author fkTBookAuthorId() {
        return new Author(this, Keys.FK_T_BOOK_AUTHOR_ID);
    }

    public Author fkTBookCoAuthorId() {
        return new Author(this, Keys.FK_T_BOOK_CO_AUTHOR_ID);
    }

    @Override
    public Book as(String alias) {
        return new Book(DSL.name(alias), this);
    }

    @Override
    public Book as(Name alias) {
        return new Book(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Book rename(String name) {
        return new Book(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Book rename(Name name) {
        return new Book(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, Integer, Integer, Integer, String, Integer, Integer, String, byte[], Integer, LocalDateTime> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
