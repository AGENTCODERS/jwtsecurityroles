//package com.agentesports.jwtsecurityroles.controller;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/v1/admin")
//@RequiredArgsConstructor
//public class AdminController {
//
//    @GetMapping
//    public ResponseEntity<String> sayHello(){
//        return ResponseEntity.ok("Hi admin");
//    }
//}

package com.agentesports.jwtsecurityroles.controller;

import com.agentesports.jwtsecurityroles.entities.Tournament;
import com.agentesports.jwtsecurityroles.service.TournamentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin")
@RequiredArgsConstructor
public class AdminController {

    private final TournamentService tournamentService;

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hi admin");
    }

    @PostMapping("/tournaments")
    @PreAuthorize("hasAuthority('Admin')")
    public ResponseEntity<Tournament> createTournament(@RequestBody Tournament tournament) {
        Tournament createdTournament = tournamentService.createTournament(tournament);
        return ResponseEntity.ok(createdTournament);
    }

    @PutMapping("/updateTournament/{id}")
    @PreAuthorize("hasAuthority('Admin')")
    public ResponseEntity<Tournament> updateTournament(@PathVariable Long id, @RequestBody Tournament tournament) {
        Tournament updatedTournament = tournamentService.updateTournament(id, tournament);
        return ResponseEntity.ok(updatedTournament);
    }

//    @GetMapping("/getAllTournaments")
//    @PreAuthorize("hasAuthority('Admin')")
//    public ResponseEntity<List<Tournament>> getAllTournaments() {
//        List<Tournament> tournaments = tournamentService.getAllTournaments();
//        return ResponseEntity.ok(tournaments);
//    }


}

