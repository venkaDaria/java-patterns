package com.globallogic.java_patterns.memento.example2;

public class PageContent {

    private String title;

    private String text;

    private int page;
    private Memento undo;

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public void setPage(final int page) {
        this.page = page;
    }

    public void preview() {
        undo = new Memento();
    }

    public void undoChanges() {
        text = undo.getText();
        page = undo.getPage();
    }

    public PageContent copy() {
        PageContent pageContent = new PageContent();

        pageContent.setTitle(title);
        pageContent.setText(text);
        pageContent.setPage(page);

        return pageContent;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PageContent that = (PageContent) o;
        return page == that.page && title.equals(that.title) && text.equals(that.text);
    }

    @Override
    public int hashCode() {
        return 31 * title.hashCode() + text.hashCode();
    }

    private class Memento {
        private String mText;

        private int mPage;

        Memento() {
            mText = text;
            mPage = page;
        }

        String getText() {
            return mText;
        }

        int getPage() {
            return mPage;
        }
    }
}
