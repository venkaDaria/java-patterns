package com.globallogic.java_patterns.flyweight;

import com.globallogic.java_patterns.flyweight.impl.Roman;
import com.globallogic.java_patterns.flyweight.impl.Story;

import java.util.HashMap;
import java.util.function.Supplier;

public class BookFactory {

    // or one map (key - type of object)
    private static final HashMap<String, Story> stories = new HashMap<>();
    private static final HashMap<String, Roman> romans = new HashMap<>();

    public static Roman getRoman(String title) {
        return getBook(title, romans, Roman::new);
    }

    public static Story getStory(String title) {
        return getBook(title, stories, Story::new);
    }

    private static <TypeBook extends Book> TypeBook getBook(final String title, final HashMap<String, TypeBook> cache,
                                                            final Supplier<TypeBook> create) {
        if (cache.containsKey(title)) {
            return cache.get(title);
        }

        TypeBook book = create.get();
        book.setTitle(title);

        cache.put(title, book);

        return book;
    }

    public static void clear() {
        stories.clear();
        romans.clear();
    }
}

