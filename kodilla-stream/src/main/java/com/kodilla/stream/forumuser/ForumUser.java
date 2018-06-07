package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int uniqueId;
    private final String nameUser;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberPostPublicate;

    public ForumUser(final int uniqueId, final String nameUser, final char sex,LocalDate localDate,
                     final int numberPostPublicate) {
        this.uniqueId = uniqueId;
        this.nameUser = nameUser;
        this.sex = sex;
        this.dateOfBirth = localDate;
        this.numberPostPublicate = numberPostPublicate;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public String getNameUser() {
        return nameUser;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberPostPublicate() {
        return numberPostPublicate;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uniqueId=" + uniqueId +
                ", nameUser='" + nameUser + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberPostPublicate=" + numberPostPublicate +
                '}';
    }
}
