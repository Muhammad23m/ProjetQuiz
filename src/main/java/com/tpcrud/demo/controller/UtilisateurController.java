package com.tpcrud.demo.controller;

import com.tpcrud.demo.modele.Utilisateur;
import com.tpcrud.demo.service.UtilisateurService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/utilisateur")
public class UtilisateurController {

    private final UtilisateurService utilisateurService;
    /**
     * Crée un nouvel utilisateur.
     * @param utilisateur L'utilisateur à créer.
     * @return L'utilisateur créé.
     */
    @PostMapping("/create")
    public  Utilisateur create(@RequestBody Utilisateur utilisateur){
        return utilisateurService.creer(utilisateur);
    }
    /**
     * Lit tous les utilisateurs.
     * @return Une liste de tous les utilisateurs.
     */
    @GetMapping("/read")
    public List<Utilisateur> read(){
        return utilisateurService.lire();
    }
    /**
     * Met à jour un utilisateur avec l'ID donné.
     * @param id L'ID de l'utilisateur à mettre à jour.
     * @param utilisateur L'utilisateur avec les données mises à jour.
     * @return L'utilisateur mis à jour.
     */
    @PutMapping("/update/{id}")
    public Utilisateur update(@PathVariable Long id,@RequestBody Utilisateur utilisateur){
        return utilisateurService.modifier(id, utilisateur);
    }
    /**
     * Supprime un utilisateur avec l'ID donné.
     * @param id L'ID de l'utilisateur à supprimer.
     * @return Une chaîne indiquant le succès de la suppression.
     */
    @DeleteMapping("/delete/{id}")
    public  String delete(@PathVariable long id){
        return utilisateurService.supprimer(id);
    }
}
