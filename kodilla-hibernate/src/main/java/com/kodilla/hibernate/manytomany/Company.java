package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@NamedNativeQueries({
        @NamedNativeQuery(
                name = "Company.findCompaniesByPartialName",
                query = " SELECT * FROM COMPANIES" +
                        " WHERE COMPANY_NAME LIKE CONCAT(:prefix,'%') ",
                resultClass = Company.class
        ),

        @NamedNativeQuery(
                name = "Company.findCompaniesByAnyPartOfName",
                query = " SELECT * FROM COMPANIES" +
                        " WHERE COMPANY_NAME LIKE CONCAT('%',:prefix,'%') ",
                resultClass = Company.class
        )}
)


@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    private void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
