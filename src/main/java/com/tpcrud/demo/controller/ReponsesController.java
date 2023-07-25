package com.tpcrud.demo.controller;

import com.tpcrud.demo.modele.Reponses;
import com.tpcrud.demo.service.ReponsesService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/reponses")
@AllArgsConstructor
public class ReponsesController {
    private final ReponsesService reponsesService;
    @PostMapping("/create")
    public Reponses create(@RequestBody Reponses reponses){
        return reponsesService.creer(reponses);
    }
    @GetMapping("/read")
    public List<Reponses> read(){
        return reponsesService.lire();
    }

    @PutMapping("/update/{id}")
    public Reponses update(@PathVariable long id,@RequestBody Reponses reponses){
        return reponsesService.modifier(id, reponses);
    }
    @DeleteMapping("/delete")
    public String delete(@PathVariable long id){
        return reponsesService.supprimer(id);
    }
}
