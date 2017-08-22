package com.globallogic.java_patterns.memento;

import com.globallogic.java_patterns.memento.example2.PageContent;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PageContentTest {

    @Test
    public void mementoRestoreTest() {
        PageContent page = new PageContent();

        page.setPage(0);
        page.setText("hello");
        page.setTitle("PageContent");

        PageContent page2 = page.copy();
        page.preview();

        page.setPage(1);
        page.setText("Good day");

        page.undoChanges();

        assertEquals(page2, page);
    }
}
