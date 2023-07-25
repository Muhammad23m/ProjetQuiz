package com.tpcrud.demo.controller;

import com.tpcrud.demo.modele.Questions;
import com.tpcrud.demo.service.QuestionsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
@AllArgsConstructor
public class QuestionsController {

    private final QuestionsService questionsService;

    @PostMapping("/create")
    public Questions create(@RequestBody Questions questions){
        return questionsService.creer(questions);
    }

    @GetMapping("/read")
    public List<Questions> read(){
        return questionsService.lire();
    }

    @PutMapping("/update/{id}")
    public Questions update(@PathVariable long id,@RequestBody Questions questions){
        return questionsService.modifier(id,questions);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable long id){
        return questionsService.supprimer(id);
    }

}
