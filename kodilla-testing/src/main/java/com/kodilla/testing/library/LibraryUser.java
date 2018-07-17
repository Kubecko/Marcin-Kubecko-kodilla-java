package com.kodilla.testing.library;

import java.util.Objects;

public class LibraryUser {
    String firstName;
    String lastName;
    String peselId;

    public LibraryUser() {
        this.firstName = this.firstName;
        this.lastName = this.lastName;
        this.peselId = this.peselId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPeselId() {
        return this.peselId;
    }

    public String toString() {
        return "LibraryUser{firstName='" + this.firstName + '\'' + ", lastName='" + this.lastName + '\'' + ", peselId='" + this.peselId + '\'' + '}';
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            LibraryUser that = (LibraryUser)o;
            return Objects.equals(this.firstName, that.firstName) && Objects.equals(this.lastName, that.lastName) && Objects.equals(this.peselId, that.peselId);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.firstName, this.lastName, this.peselId});
    }
}
