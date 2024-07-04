package org._1iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListBookShelfIterator implements Iterator<Book> {
    private ListBookShelf listBookShelf;
    private int index;

    public ListBookShelfIterator(ListBookShelf listBookShelf) {
        this.listBookShelf = listBookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index < listBookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Book next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        Book book = listBookShelf.getBookAt(index);
        index++;
        return book;
    }

}
