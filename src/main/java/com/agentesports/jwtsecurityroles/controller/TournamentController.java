package com.agentesports.jwtsecurityroles.controller;

import com.agentesports.jwtsecurityroles.entities.Tournament;
import com.agentesports.jwtsecurityroles.service.TournamentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tournaments")
@RequiredArgsConstructor
public class TournamentController {

    private final TournamentService tournamentService;

//    @PostMapping
//    public ResponseEntity<Tournament> createTournament(@RequestBody Tournament tournament) {
//        Tournament createdTournament = tournamentService.createTournament(tournament);
//        return ResponseEntity.ok(createdTournament);
//    }

    @GetMapping("/getAllTournaments")
    public ResponseEntity<List<Tournament>> getAllTournaments() {
        List<Tournament> tournaments = tournamentService.getAllTournaments();
        return ResponseEntity.ok(tournaments);
    }
}
