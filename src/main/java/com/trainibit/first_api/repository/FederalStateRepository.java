package com.trainibit.first_api.repository;

import com.trainibit.first_api.entity.FederalState;
<<<<<<< HEAD

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

=======
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;
>>>>>>> c572bc0 (primera api)
import java.util.UUID;

@Repository
public interface FederalStateRepository extends JpaRepository<FederalState, Long> {
<<<<<<< HEAD
    FederalState getFederalStateByUuid(UUID federalStateUuid);
}
=======
    @NonNull
    List<FederalState> findAll();

    FederalState getFederalStateByUuid(UUID federalStateUuid);
}
>>>>>>> c572bc0 (primera api)
