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
            bookPyM.add(new Book("Marcin", "Kubecko", 1896, "1"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int transform = medianAdapter.publicationYearMedian(bookPyM);
        //Then
        System.out.println(transform);
        assertEquals(1896, transform);
    }
}