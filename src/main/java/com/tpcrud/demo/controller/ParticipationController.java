package com.tpcrud.demo.controller;

import com.tpcrud.demo.modele.Participation;
import com.tpcrud.demo.repository.ParticipationRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/participation")
@AllArgsConstructor
public class ParticipationController {

    private final ParticipationRepository participationRepository;

    // Create a participation
    @PostMapping("/create")
    List<Participation> read(){
        return participationRepository.lire();
    }

    // Find all participations
    @GetMapping("/participations")
    public List<Participation> findAllParticipations() {
        return participationRepository.findAll();
    }

}
