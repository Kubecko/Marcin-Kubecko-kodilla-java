package com.kodilla.good.patterns.Flights;

import java.util.Objects;

public class Client {
    private String nameUser;
    private String email;

    public Client(String nameUser, String email) {
        this.nameUser = nameUser;
        this.email = email;
    }

    public String getNameUser() {
        return nameUser;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nameUser='" + nameUser + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(nameUser, client.nameUser) &&
                Objects.equals(email, client.email);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nameUser, email);
    }
}
