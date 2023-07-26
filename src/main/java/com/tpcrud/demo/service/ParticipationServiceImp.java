package com.tpcrud.demo.service;
import com.tpcrud.demo.modele.Participation;
import com.tpcrud.demo.repository.ParticipationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ParticipationServiceImp implements ParticipationService{

    private ParticipationRepository participationRepository;

    @Override
    public Integer calculerScore(Participation participation) {
        Integer score = 0;
        for (Map.Entry<Long, Boolean> entry : participation.getReponses().entrySet()) {
            if (entry.getValue()) {
                score++;
            }
        }
        return score;
    }
}
