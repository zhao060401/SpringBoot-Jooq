/*
 * This file is generated by jOOQ.
 */
package com.exercise.generator.tables;


import com.exercise.generator.Keys;
import com.exercise.generator.Test;
import com.exercise.generator.tables.records.BookToBookStoreRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class BookToBookStore extends TableImpl<BookToBookStoreRecord> {

    private static final long serialVersionUID = -982388266;

    /**
     * The reference instance of <code>test.book_to_book_store</code>
     */
    public static final BookToBookStore BOOK_TO_BOOK_STORE = new BookToBookStore();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BookToBookStoreRecord> getRecordType() {
        return BookToBookStoreRecord.class;
    }

    /**
     * The column <code>test.book_to_book_store.book_store_name</code>.
     */
    public final TableField<BookToBookStoreRecord, String> BOOK_STORE_NAME = createField(DSL.name("book_store_name"), org.jooq.impl.SQLDataType.VARCHAR(400).nullable(false), this, "");

    /**
     * The column <code>test.book_to_book_store.book_id</code>.
     */
    public final TableField<BookToBookStoreRecord, Integer> BOOK_ID = createField(DSL.name("book_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>test.book_to_book_store.stock</code>.
     */
    public final TableField<BookToBookStoreRecord, Integer> STOCK = createField(DSL.name("stock"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>test.book_to_book_store</code> table reference
     */
    public BookToBookStore() {
        this(DSL.name("book_to_book_store"), null);
    }

    /**
     * Create an aliased <code>test.book_to_book_store</code> table reference
     */
    public BookToBookStore(String alias) {
        this(DSL.name(alias), BOOK_TO_BOOK_STORE);
    }

    /**
     * Create an aliased <code>test.book_to_book_store</code> table reference
     */
    public BookToBookStore(Name alias) {
        this(alias, BOOK_TO_BOOK_STORE);
    }

    private BookToBookStore(Name alias, Table<BookToBookStoreRecord> aliased) {
        this(alias, aliased, null);
    }

    private BookToBookStore(Name alias, Table<BookToBookStoreRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> BookToBookStore(Table<O> child, ForeignKey<O, BookToBookStoreRecord> key) {
        super(child, key, BOOK_TO_BOOK_STORE);
    }

    @Override
    public Schema getSchema() {
        return Test.TEST;
    }

    @Override
    public UniqueKey<BookToBookStoreRecord> getPrimaryKey() {
        return Keys.KEY_BOOK_TO_BOOK_STORE_PRIMARY;
    }

    @Override
    public List<UniqueKey<BookToBookStoreRecord>> getKeys() {
        return Arrays.<UniqueKey<BookToBookStoreRecord>>asList(Keys.KEY_BOOK_TO_BOOK_STORE_PRIMARY);
    }

    @Override
    public List<ForeignKey<BookToBookStoreRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BookToBookStoreRecord, ?>>asList(Keys.FK_B2BS_BS_NAME, Keys.FK_B2BS_B_ID);
    }

    public BookStore bookStore() {
        return new BookStore(this, Keys.FK_B2BS_BS_NAME);
    }

    public Book book() {
        return new Book(this, Keys.FK_B2BS_B_ID);
    }

    @Override
    public BookToBookStore as(String alias) {
        return new BookToBookStore(DSL.name(alias), this);
    }

    @Override
    public BookToBookStore as(Name alias) {
        return new BookToBookStore(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BookToBookStore rename(String name) {
        return new BookToBookStore(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BookToBookStore rename(Name name) {
        return new BookToBookStore(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
