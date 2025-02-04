package com.trainibit.first_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
<<<<<<< HEAD
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
=======
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "roles")
public class Role {
    @Id
    @Column(name = "id", nullable = false)
<<<<<<< HEAD
=======
    @GeneratedValue(strategy = GenerationType.IDENTITY)
>>>>>>> c572bc0 (primera api)
    private Long id;

    @Column(name = "name", nullable = false, length = Integer.MAX_VALUE)
    private String name;

<<<<<<< HEAD
    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_date", nullable = false)
    private Timestamp createdDate;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_date", nullable = false)
=======
    @Column(name = "created_date", nullable = false)
    @CreationTimestamp
    private Timestamp createdDate;

    @Column(name = "updated_date", nullable = false)
    @UpdateTimestamp
>>>>>>> c572bc0 (primera api)
    private Timestamp updatedDate;

    @Column(name = "uuid", nullable = false)
    private UUID uuid;
<<<<<<< HEAD

=======
>>>>>>> c572bc0 (primera api)
}