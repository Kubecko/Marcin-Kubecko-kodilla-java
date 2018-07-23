package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Test
    public void testInvoiceDaoSave(){
        //Given
        Invoice invoice = new Invoice("Invoice for Bike 12354");

        Product product = new Product("Bike");
        Item item = new Item(new BigDecimal(150), 1, new BigDecimal(150));
        Item item1 = new Item(new BigDecimal(55),5, new BigDecimal(275));
        Item item2 = new Item(new BigDecimal(15),8, new BigDecimal(120));

        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        //Then
        Assert.assertNotEquals(0, id);
        //CleanUp
        invoiceDao.delete(id);
    }
}
