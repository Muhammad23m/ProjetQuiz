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
    /**
     * Crée un nouvel utilisateur.
     * @param utilisateur L'utilisateur à créer.
     * @return L'utilisateur créé.
     */
    @PostMapping("/create")
    public  Utilisateur create(@RequestBody Utilisateur utilisateur){
        // Crée un nouvel utilisateur à partir des données de la requête.
        return utilisateurService.creer(utilisateur);
    }
    /**
     * Lit tous les utilisateurs.
     * @return Une liste de tous les utilisateurs.
     */
    @GetMapping("/read")
    public List<Utilisateur> read(){
        // Lit tous les utilisateurs de la base de données.
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
        // Met à jour l'utilisateur dans la base de données avec les données de la requête.
        return utilisateurService.modifier(id, utilisateur);
    }
    /**
     * Supprime un utilisateur avec l'ID donné.
     * @param id L'ID de l'utilisateur à supprimer.
     * @return Une chaîne indiquant le succès de la suppression.
     */
    @DeleteMapping("/delete/{id}")
    public  String delete(@PathVariable long id){
        // Supprime l'utilisateur de la base de données avec l'ID donné.
        return utilisateurService.supprimer(id);
    }
}
