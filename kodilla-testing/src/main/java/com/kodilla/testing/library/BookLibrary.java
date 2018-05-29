package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase){
        this.libraryDatabase = libraryDatabase;
    }

    List<Book> listBooksWithCondition(String titleFragment){
       List<Book> bookList = new ArrayList<Book>();
       if(titleFragment.length() <3 ) return bookList;

       List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
       if(resultList.size() > 20) return bookList;
       bookList = resultList;
       return bookList;
    }

    List<Book> listBooksInHandsOf(LibraryUser libraryUser){
        List<Book> bookList = libraryDatabase.listBooksInHandsOf(libraryUser);

        if(bookList.size() == 0) return bookList;
        if(bookList.size() == 1) return bookList;
        if(bookList.size() == 5) return bookList;

        return bookList;
    }
}
