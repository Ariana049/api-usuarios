package com.trainibit.first_api.response;

<<<<<<< HEAD
import com.trainibit.first_api.entity.FederalState;
import com.trainibit.first_api.entity.RolesByUser;
import lombok.Getter;
import lombok.Setter;
=======
import lombok.Data;
>>>>>>> c572bc0 (primera api)

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

<<<<<<< HEAD
@Getter
@Setter
=======
@Data
>>>>>>> c572bc0 (primera api)
public class UserResponse {

    private String firstName;
    private String lastName;
    private String email;
    private UUID uuid;
    private LocalDate birthDate;
    private Timestamp createdDate;
    private Timestamp updatedDate;
    private String age;
    private String planet;
<<<<<<< HEAD
    private FederalState federalState;
    private List<RolesByUser> roles;
=======
    private FederalStateResponse federalState;
    private List<RolesByUserResponse> roles;
>>>>>>> c572bc0 (primera api)
}
