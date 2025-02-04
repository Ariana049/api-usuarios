package com.trainibit.first_api.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserRequestPut {
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate birthdate;
    private String planet;

    public UserRequestPut(String firstName, String lastName, String email, LocalDate birthdate, String planet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthdate = birthdate;
        this.planet = planet;
    }
}