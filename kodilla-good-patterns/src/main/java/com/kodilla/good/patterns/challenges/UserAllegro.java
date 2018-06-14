package com.kodilla.good.patterns.challenges;

public final class UserAllegro {
    private final String nameUser;
    private final String email;

    public UserAllegro(String nameUser, String email) {
        this.nameUser = nameUser;
        this.email = email;
    }

    public String getNameUser() {
        return nameUser;
    }

    public String getEmail() {
        return email;
    }
}
