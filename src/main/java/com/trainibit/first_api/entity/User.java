package com.trainibit.first_api.entity;

<<<<<<< HEAD
=======
import com.fasterxml.jackson.annotation.JsonManagedReference;
>>>>>>> c572bc0 (primera api)
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
<<<<<<< HEAD
import lombok.Getter;
import lombok.Setter;
=======
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
>>>>>>> c572bc0 (primera api)

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

<<<<<<< HEAD
@Getter
@Setter
=======
@Data
>>>>>>> c572bc0 (primera api)
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "birthdate")
    private LocalDate birthdate;

    @Column(name = "created_date", nullable = false)
<<<<<<< HEAD
    private Timestamp createdDate;

    @Column(name = "updated_date", nullable = false)
=======
    @CreationTimestamp
    private Timestamp createdDate;

    @Column(name = "updated_date", nullable = false)
    @UpdateTimestamp
>>>>>>> c572bc0 (primera api)
    private Timestamp updatedDate;

    @Column(name = "uuid")
    private UUID uuid;

    @Column(name = "planet")
    private String planet;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "federal_state_id", nullable = false)
    private FederalState federalState;

<<<<<<< HEAD
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<RolesByUser> roles = new ArrayList<>();

}
=======
    @JsonManagedReference
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<RolesByUser> roles = new ArrayList<>();

    @Column(name = "first_token")
    private String firstToken;
}
>>>>>>> c572bc0 (primera api)
