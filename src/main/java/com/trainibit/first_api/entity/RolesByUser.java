package com.trainibit.first_api.entity;

<<<<<<< HEAD
=======
import com.fasterxml.jackson.annotation.JsonBackReference;
>>>>>>> c572bc0 (primera api)
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
<<<<<<< HEAD
import lombok.Getter;
import lombok.Setter;

import org.hibernate.annotations.ColumnDefault;
=======
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
>>>>>>> c572bc0 (primera api)

import java.sql.Timestamp;
import java.util.UUID;

<<<<<<< HEAD
@Getter
@Setter
=======
@Data
>>>>>>> c572bc0 (primera api)
@Entity
@Table(name = "roles_by_users")
public class RolesByUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

<<<<<<< HEAD
=======
    @JsonBackReference
>>>>>>> c572bc0 (primera api)
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

<<<<<<< HEAD
    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_date", nullable = false)
    private Timestamp createdDate;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_date", nullable = false)
=======
    @Column(name = "created_date", insertable = false, updatable = false)
    @CreationTimestamp
    private Timestamp createdDate;

    @Column(name = "updated_date", insertable = false)
    @UpdateTimestamp
>>>>>>> c572bc0 (primera api)
    private Timestamp updatedDate;

    @Column(name = "uuid", nullable = false)
    private UUID uuid;
<<<<<<< HEAD
=======

    @Column(name = "activated", nullable = false)
    private Boolean activated;
>>>>>>> c572bc0 (primera api)
}