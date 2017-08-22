package com.globallogic.java_patterns.iterator;

import com.globallogic.java_patterns.WriterTest;
import com.globallogic.java_patterns.iterator.impl.Book;
import com.globallogic.java_patterns.iterator.impl.Library;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LibraryTest extends WriterTest {

    @Test
    public void forEachTest() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("One"));
        books.add(new Book("Two"));
        books.add(new Book("Three"));

        Library library = new Library(books);

        library.forEach(System.out::println);

        assertEquals("Book: One" + System.lineSeparator() + "Book: Two" + System.lineSeparator()
                + "Book: Three" + System.lineSeparator(), outContent.toString());
    }
}
