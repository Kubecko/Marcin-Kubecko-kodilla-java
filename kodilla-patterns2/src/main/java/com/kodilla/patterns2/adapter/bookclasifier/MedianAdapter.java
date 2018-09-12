package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> booksListMap = new HashMap<>();
        for (Book bookPyM : bookSet) {
            booksListMap.put(new BookSignature(bookPyM.getSignature()), new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book
                    (bookPyM.getAuthor(), bookPyM.getTitle(), bookPyM.getPublicationYear()));
        }
        return medianPublicationYear(booksListMap);
    }
}
