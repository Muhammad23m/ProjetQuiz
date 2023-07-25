package com.tpcrud.demo.controller;

import com.tpcrud.demo.modele.Utilisateur;
import com.tpcrud.demo.service.UtilisateurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utilisateur")
@AllArgsConstructor
public class UtilisateurController {

    private final UtilisateurService utilisateurService;

    @PostMapping("/create")
    public  Utilisateur create(@RequestBody Utilisateur utilisateur){
        return utilisateurService.creer(utilisateur);
    }

    @GetMapping("/read")
    public List<Utilisateur> read(){
        return utilisateurService.lire();
    }

    @PutMapping("/update/{id}")
    public Utilisateur update(@PathVariable Long id,@RequestBody Utilisateur utilisateur){
        return utilisateurService.modifier(id, utilisateur);
    }
    @DeleteMapping("/delete/{id}")
    public  String delete(@PathVariable long id){
        return utilisateurService.supprimer(id);
    }
}
