package com.kodilla.patterns.library;

import java.util.HashSet;
import java.util.Set;

public class Library extends PrototypeLib {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }


    public Library shallowClone() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library cloneLibrary = (Library) super.clone();
        cloneLibrary.books = new HashSet<>();
        for (Book theBook : books) {
            Book clonedBook = new Book(theBook.getAuthor(), theBook.getTitle(), theBook.getPublicationDate());
            cloneLibrary.getBooks().add(clonedBook);
        }
        return cloneLibrary;
    }
}

