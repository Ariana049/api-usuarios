package com.trainibit.first_api.repository;

import com.trainibit.first_api.entity.FederalState;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FederalStateRepository extends JpaRepository<FederalState, Long> {
    FederalState getFederalStateByUuid(UUID federalStateUuid);
}
