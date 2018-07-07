package com.kodilla.patterns.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        Book book1 = new Book("Book1","Author1",LocalDate.of(1977,12,12));
        Book book2 = new Book("Book2","Author2",LocalDate.of(1987,11,30));
        Book book3 = new Book("Book3","Author3",LocalDate.of(1957,8,15));
        Book book4 = new Book("Book4","Author4",LocalDate.of(1979,7,5));
        Book book5 = new Book("Book5","Author5",LocalDate.of(1985,9,22));

        Library library = new Library("Library1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        Library shallowCloneLibrary = null;
        try {
            shallowCloneLibrary = library.shallowClone();
            shallowCloneLibrary.setName("Library Clone Two");

        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Library Clone Three");
        } catch(CloneNotSupportedException e){
            System.out.println(e);
        }

        System.out.println(library);
        System.out.println(shallowCloneLibrary);
        System.out.println(deepCloneLibrary);
        //When
        library.getBooks().remove(book2);
        //Then
        Assert.assertEquals(4,library.getBooks().size());
        Assert.assertEquals(4,shallowCloneLibrary.getBooks().size());
        Assert.assertEquals(5,deepCloneLibrary.getBooks().size());
    }
}