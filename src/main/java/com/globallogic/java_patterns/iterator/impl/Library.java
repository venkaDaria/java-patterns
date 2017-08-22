package com.globallogic.java_patterns.iterator.impl;

import com.globallogic.java_patterns.iterator.Container;
import com.globallogic.java_patterns.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

// implements java.util.Iterable
public class Library implements Container {

    private final List<Book> books;

    public Library(final List<Book> books) {
        this.books = new ArrayList<>(books);
    }

    @Override
    public Iterator<Book> getIterator() {
        return new BookIterator();
    }

    public void forEach(final Consumer<Book> func) {
        Iterator<Book> it = getIterator();

        while (it.hasNext()) {
            func.accept(it.next());
        }
    }

    // implements java.util.Iterator
    private class BookIterator implements Iterator<Book> {

        private int index;

        @Override
        public boolean hasNext() {
            return index < books.size();
        }

        @Override
        public Book next() {
            return (this.hasNext()) ?  books.get(index++) : null;
        }
    }
}

