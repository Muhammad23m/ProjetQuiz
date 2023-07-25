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

    @PostMapping("/create")
    public Quiz create(@RequestBody Quiz quiz){
        return quizService.creer(quiz);
    }

    @GetMapping("/read")
    public List<Quiz> read(){
        return quizService.lire();
    }

    @PutMapping("/update/{id}")
    public Quiz Update(@PathVariable long id, @RequestBody Quiz quiz){
        return quizService.modifier(id, quiz);
    }

    @DeleteMapping("/delete")
    public String delete(@PathVariable long id){
        return quizService.supprimer(id);
    }
}
