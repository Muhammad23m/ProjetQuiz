package com.tpcrud.demo.service;
import com.tpcrud.demo.modele.Participation;
import com.tpcrud.demo.repository.ParticipationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ParticipationServiceImp implements ParticipationService{

    private final ParticipationRepository participationRepository;

    public ParticipationServiceImp(ParticipationRepository participationRepository) {
        this.participationRepository = participationRepository;
    }

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

    @Override
    public Participation creer(Participation participation) {
        return null;
    }

    @Override
    public List<Participation> lire() {
        return null;
    }

}

