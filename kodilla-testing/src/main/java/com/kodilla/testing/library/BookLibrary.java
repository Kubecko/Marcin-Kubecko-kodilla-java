package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList();
        if (titleFragment.length() < 3) {
            return bookList;
        } else {
            List<Book> resultList = this.libraryDatabase.listBooksWithCondition(titleFragment);
            return (List)(resultList.size() > 20 ? bookList : resultList);
        }
    }

    List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        return this.libraryDatabase.listBooksInHandsOf(libraryUser);
    }
}
