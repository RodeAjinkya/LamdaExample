package com.siro.lamdaExample;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class User {
    private String name;
    private String surname;
    private String emailAddress;

    public User(String name, String surname, String emailAddress) {
        this.name = name;
        this.surname = surname;
        this.emailAddress = emailAddress;
    }
}
