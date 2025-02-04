package com.trainibit.first_api.request;

<<<<<<< HEAD
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

@Getter
@Setter
public class UserRequestPost {
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate birthdate;
    private UUID federalStateUuid;
    private ArrayList<RoleUserRequest> roles;

    public UserRequestPost(String firstName, String lastName, String email, LocalDate birthdate, UUID federalStateUuid, ArrayList<RoleUserRequest> roles) {
=======
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.util.ArrayList;

@Data
public class UserRequestPost {
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @Email
    private String email;
    @Pattern(regexp = "^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$")
    //private LocalDate birthdate;
    private String birthdate;
    @Pattern(regexp = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$")
    //private UUID federalStateUuid;
    private String federalStateUuid;
    @Valid
    private ArrayList<RoleUserRequestPost> roles;

    public UserRequestPost(String firstName, String lastName, String email, String birthdate, String federalStateUuid, ArrayList<RoleUserRequestPost> roles) {
>>>>>>> c572bc0 (primera api)
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthdate = birthdate;
        this.federalStateUuid = federalStateUuid;
        this.roles = roles;
<<<<<<< HEAD
}
}
=======
    }
}
>>>>>>> c572bc0 (primera api)
