package com.kodilla.stream.com.kodilla.stream.book;

public final class Book {
    private final String author;
    private final String title;
    private final int yearPublication;
    private final String signature;



    public Book(final String author, final String title, final int yearPublication, final String signature) {
        this.author = author;
        this.title = title;
        this.yearPublication = yearPublication;
        this.signature = signature;

    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public String getSignature() {
        return signature;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearPublication=" + yearPublication +
                ", signature='" + signature + '\'' +
                '}';
    }
}
