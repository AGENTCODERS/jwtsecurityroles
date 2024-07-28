package com.agentesports.jwtsecurityroles.service;

import com.agentesports.jwtsecurityroles.entities.Tournament;
import com.agentesports.jwtsecurityroles.repository.TournamentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TournamentService {

    private final TournamentRepository tournamentRepository;

    public Tournament createTournament(Tournament tournament) {
        return tournamentRepository.save(tournament);
    }

    public List<Tournament> getAllTournaments() {
        return tournamentRepository.findAll();
    }

    public Tournament updateTournament(Long id, Tournament tournamentDetails) {
        Tournament tournament = tournamentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Tournament not found with id: " + id));

        tournament.setName(tournamentDetails.getName());
        tournament.setPrizePool(tournamentDetails.getPrizePool());
        tournament.setRegStartTime(tournamentDetails.getRegStartTime());
        tournament.setRegEndTime(tournamentDetails.getRegEndTime());
        tournament.setEntryFee(tournamentDetails.getEntryFee());
        tournament.setPrizeDistribution(tournamentDetails.getPrizeDistribution());
        tournament.setHostedBy(tournamentDetails.getHostedBy());
        tournament.setType(tournamentDetails.getType());
        tournament.setTotalSlots(tournamentDetails.getTotalSlots());
        tournament.setAvailableSlots(tournamentDetails.getAvailableSlots());
        tournament.setStatus(tournamentDetails.getStatus());

        return tournamentRepository.save(tournament);
    }
}
