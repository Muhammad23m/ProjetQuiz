package com.tpcrud.demo.service;

import com.tpcrud.demo.modele.Reponses;
import com.tpcrud.demo.repository.ReponsesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReponsesServiceImp implements ReponsesService {
    private final ReponsesRepository reponsesRepository;

    public ReponsesServiceImp(ReponsesRepository reponsesRepository) {
        this.reponsesRepository = reponsesRepository;
    }

    @Override
    public Reponses creer(Reponses reponses) {
        return reponsesRepository.save(reponses);
    }

    @Override
    public List<Reponses> lire() {
        return reponsesRepository.findAll();
    }

    @Override
    public Reponses modifier(long id, Reponses reponses) {
        return reponsesRepository.findById(id)
                .map(r -> {
                    r.setText(reponses.getText());
                    r.setResultat(reponses.getResultat());
                    return reponsesRepository.save(r);
                }).orElseThrow(() -> new RuntimeException(("Reponse non trouvée")));
    }

    @Override
    public String supprimer(long id) {
        reponsesRepository.deleteById(id);
        return "Reponses supprimer";
    }
}
