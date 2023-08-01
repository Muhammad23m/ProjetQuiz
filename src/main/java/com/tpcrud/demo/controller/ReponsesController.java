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
    /**
     * Crée une nouvelle réponse.
     * @param reponses La réponse à créer.
     * @return La réponse créée.
     */
    @PostMapping("/create")
    public Reponses create(@RequestBody Reponses reponses){
        return reponsesService.creer(reponses);
    }
    /**
     * Lit toutes les réponses.
     * @return Une liste de toutes les réponses.
     */
    @GetMapping("/read")
    public List<Reponses> read(){
        return reponsesService.lire();
    }
    /**
     * Met à jour une réponse avec l'ID donné.
     * @param id L'ID de la réponse à mettre à jour.
     * @param reponses La réponse avec les données mises à jour.
     * @return La réponse mise à jour.
     */
    @PutMapping("/update/{id}")
    public Reponses update(@PathVariable long id,@RequestBody Reponses reponses){
        return reponsesService.modifier(id, reponses);
    }
    /**
     * Supprime une réponse avec l'ID donné.
     * @param id L'ID de la réponse à supprimer.
     * @return Une chaîne indiquant le succès de la suppression.
     */
    @DeleteMapping("/delete")
    public String delete(@PathVariable long id){
        return reponsesService.supprimer(id);
    }
}
