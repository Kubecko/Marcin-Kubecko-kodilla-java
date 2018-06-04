package com.kodilla.stream.om.kodilla.stream.book;

import com.kodilla.stream.com.kodilla.stream.book.Book;
import com.kodilla.stream.com.kodilla.stream.book.BookDirectory;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class BookTestSuite {
    @Test
    public void testGetListUsingFor() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();
        //When
        List<Book> books = bookDirectory.getList();
        //Then
        int numberOfBooksPublicatedAfter2007 = 0;
        for (Book book : books) {
            if (book.getYearPublication() > 2007) {
                numberOfBooksPublicatedAfter2007++;
            }
        }
        Assert.assertEquals(3,numberOfBooksPublicatedAfter2007);
    }
    @Test
    public void testGetListUsingIntStream(){
        //Given
        BookDirectory bookDirectory = new BookDirectory();
        //When
        List<Book> books = bookDirectory.getList();
        //Then
        long numberOfBooksPublicatedAfter2007 = IntStream.range(0, books.size())
                .filter(n -> books.get(n).getYearPublication() > 2007 )
                //.map(n -> 1)
                .count();
        //Then
        Assert.assertEquals(3,numberOfBooksPublicatedAfter2007 );
    }
}
