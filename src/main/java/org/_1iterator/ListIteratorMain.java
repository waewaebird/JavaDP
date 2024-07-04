package org._1iterator;

import java.util.Iterator;

public class ListIteratorMain {
    public static void main(String[] args) {
        ListBookShelf listBookShelf = new ListBookShelf();
        listBookShelf.appendBook(new Book("Around the World in 80 Days"));
        listBookShelf.appendBook(new Book("Bible"));
        listBookShelf.appendBook(new Book("Cinderella"));
        listBookShelf.appendBook(new Book("Daddy-Long-Legs"));
        listBookShelf.appendBook(new Book("GODADDYPLZ"));
        listBookShelf.appendBook(new Book("tttestttest"));

        Iterator<Book> it = listBookShelf.iterator();
        while(it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        for(Book book : listBookShelf) {
            System.out.println(book.getName());
        }
        System.out.println();
    }
}
