package com.kodilla.hibernate.manytomany.facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private Facade facade;
    @Test
    public void companyFindPartName(){
        Company Ferrari = new Company("Ferrari");
        Company Mercedes = new Company("Mercedes");

        companyDao.save(Ferrari);
        companyDao.save(Mercedes);

        List<Company> findByName = facade.companyFindPartName("er");

        Assert.assertEquals(2, findByName.size());
        Assert.assertTrue(findByName.contains(Ferrari));
        try {
            companyDao.delete(Ferrari);
            companyDao.delete(Mercedes);
        } catch (Exception e){

        }
    }

    @Test
    public void employeeFindByName() {
        Employee johnSmith = new Employee("John","Smith");
        Employee lionelMessi = new Employee("Lionel", "Messi");
        Employee cristianoRonaldo = new Employee("Cristianio","Ronaldo");

        employeeDao.save(johnSmith);
        employeeDao.save(lionelMessi);
        employeeDao.save(cristianoRonaldo);

        List<Employee> findByName = facade.employeeFindByAnyname("ss");

        Assert.assertEquals(1,findByName.size());
        Assert.assertTrue(findByName.contains(lionelMessi));
        try{
            employeeDao.delete(johnSmith);
            employeeDao.delete(lionelMessi);
            employeeDao.delete(cristianoRonaldo);
        } catch (Exception e) {

        }
    }
}
