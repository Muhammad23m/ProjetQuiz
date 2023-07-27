package com.tpcrud.demo.controller;

import com.tpcrud.demo.modele.Participation;
import com.tpcrud.demo.repository.ParticipationRepository;
import com.tpcrud.demo.service.ParticipationService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/participation")
@AllArgsConstructor
public class ParticipationController {

    private final ParticipationService participationService;

    // Create a participation
    @PostMapping("/create")
    public Participation create(@RequestBody Participation participation){
        return participationService.creer(participation);
    }

    // Find all participation
    @GetMapping("/read")
    public List<Participation> read() {
        return participationService.lire();
    }

}
