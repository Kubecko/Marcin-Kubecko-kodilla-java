package com.kodilla.good.patterns.Food2Door;

public final class Client {
    private final String userName;
    private final String email;

    public Client(final String userName, final String email) {
        this.userName = userName;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }
}
