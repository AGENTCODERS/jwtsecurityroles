package com.agentesports.jwtsecurityroles.repository;

import com.agentesports.jwtsecurityroles.entities.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TournamentRepository extends JpaRepository<Tournament, Long> {
}
