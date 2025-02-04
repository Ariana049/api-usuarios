package com.trainibit.first_api.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import java.sql.Timestamp;
import java.util.UUID;

@Data
@Entity
@Table(name = "roles_by_users")
public class RolesByUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    @Column(name = "created_date", insertable = false, updatable = false)
    @CreationTimestamp
    private Timestamp createdDate;

    @Column(name = "updated_date", insertable = false)
    @UpdateTimestamp
    private Timestamp updatedDate;

    @Column(name = "uuid", nullable = false)
    private UUID uuid;

    @Column(name = "activated", nullable = false)
    private Boolean activated;
}