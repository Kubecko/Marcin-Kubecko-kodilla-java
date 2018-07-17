package com.kodilla.testing.library;

import java.util.Objects;

public class Book {
    String title;
    String author;
    int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public String toString() {
        return "Book{title='" + this.title + '\'' + ", author='" + this.author + '\'' + ", publicationYear=" + this.publicationYear + '}';
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Book book = (Book)o;
            return this.publicationYear == book.publicationYear && Objects.equals(this.title, book.title) && Objects.equals(this.author, book.author);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.title, this.author, this.publicationYear});
    }
}
