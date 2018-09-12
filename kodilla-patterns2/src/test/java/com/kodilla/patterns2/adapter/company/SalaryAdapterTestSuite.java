package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.company.oldhrsystem.Workers;
import org.junit.Test;


import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class SalaryAdapterTestSuite {
    @Test
    public void testTotalSalary() {
        //Given
        Workers workers = new Workers();
        SalaryAdapter salaryAdapter = new SalaryAdapter();
        //When
        double totalSalary = salaryAdapter.TotalSalary(workers.getWorkers(), workers.getSalaries());
        //Then
        System.out.println(totalSalary);
        assertEquals(totalSalary, 27750, 0);
    }
    @Test
    public void testTest() {
        //Given
        Set<Book> bookPyM = new HashSet<>();
            bookPyM.add(new Book("User0", "Name0", 2000, "1"));
            bookPyM.add(new Book("User1", "Name1", 2012, "2"));
            bookPyM.add(new Book("User2", "Name2", 2002, "3"));
            bookPyM.add(new Book("User3", "Name3", 2009, "4"));

        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int transform = medianAdapter.publicationYearMedian(bookPyM);
        //Then
        System.out.println(transform);
        assertEquals(2009, transform);
    }
}