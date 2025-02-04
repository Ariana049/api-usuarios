package com.trainibit.first_api.request;

<<<<<<< HEAD
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
=======
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.util.ArrayList;

@Data
public class UserRequestPut {
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @Email
    private String email;
    @Pattern(regexp = "^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$")
    private String birthdate;
    @NotBlank
    private String planet;
    @Pattern(regexp = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$")
    private String federalStateUuid;
    @Valid
    private ArrayList<RoleUserRequestPut> roles;
    
    public UserRequestPut(String firstName, String lastName, String email, String birthdate, String planet, String federalStateUuid, ArrayList<RoleUserRequestPut> roles) {
>>>>>>> c572bc0 (primera api)
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthdate = birthdate;
        this.planet = planet;
<<<<<<< HEAD
    }
}
=======
        this.federalStateUuid = federalStateUuid;
        this.roles = roles;
    }
}
>>>>>>> c572bc0 (primera api)
