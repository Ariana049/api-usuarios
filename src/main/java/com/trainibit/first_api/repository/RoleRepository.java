package com.trainibit.first_api.repository;

import com.trainibit.first_api.entity.Role;
<<<<<<< HEAD
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role getRoleByUuid(UUID roleUuid);
}
=======
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    @NonNull
    List<Role> findAll();

    Role getRoleByUuid(UUID roleUuid);
}
>>>>>>> c572bc0 (primera api)
