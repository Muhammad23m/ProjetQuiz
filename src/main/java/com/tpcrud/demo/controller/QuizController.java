package com.tpcrud.demo.controller;

import com.tpcrud.demo.modele.Quiz;
import com.tpcrud.demo.service.QuizService;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Quiz")
@AllArgsConstructor
public class QuizController {
    private final QuizService quizService;
    /**
     * Crée un nouveau quiz.
     * @param quiz Le quiz à créer.
     * @return Le quiz créé.
     */
    @PostMapping("/create")
    public Quiz create(@RequestBody Quiz quiz){
        // Crée un nouveau quiz à partir des données de la requête.
        return quizService.creer(quiz);
    }
    /**
     * Lit tous les quizzes.
     * @return Une liste de tous les quizzes.
     */
    @GetMapping("/read")
    public List <Quiz> read(){
        // Lit tous les quizzes de la base de données.
        return quizService.lire();
    }
    /**
     * Met à jour un quiz avec l'ID donné.
     * @param id L'ID du quiz à mettre à jour.
     * @param quiz Le quiz avec les données mises à jour.
     * @return Le quiz mis à jour.
     */
    @PutMapping("/update/{id}")
    public Quiz Update(@PathVariable long id, @RequestBody Quiz quiz){
        // Met à jour le quiz dans la base de données avec les données de la requête.
        return quizService.modifier(id, quiz);
    }
    /**
     * Supprime un quiz avec l'ID donné.
     * @param id L'ID du quiz à supprimer.
     * @return Une chaîne indiquant le succès de la suppression.
     */
    @DeleteMapping("/delete")
    public String delete(@PathVariable long id){
        // Supprime le quiz de la base de données avec l'ID donné.
        return quizService.supprimer(id);
    }
}
