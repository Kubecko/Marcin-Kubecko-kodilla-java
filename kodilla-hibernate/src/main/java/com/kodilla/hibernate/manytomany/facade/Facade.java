package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class Facade {
    @Autowired
    private EmployeeDao employee;
    @Autowired
    private CompanyDao company;


    public List<Company> companyFindPartName(final String name){
        return company.findCompaniesByAnyPartOfName(name);
    }

    public List<Employee> employeeFindByAnyname(final String name) {
        return employee.findByAnyName(name);
    }
}