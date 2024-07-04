package org._1iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListBookShelf implements Iterable<Book> {
    private List<Book> books;
    private int last = 0;

    public ListBookShelf() {
        this.books = new ArrayList<>();
    }

    public Book getBookAt(int index) {
        return this.books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
    }

    public int getLength() {
        return this.books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new ListBookShelfIterator(this);
    }
}
