package com.tpcrud.demo.service;

import com.tpcrud.demo.modele.Utilisateur;
import com.tpcrud.demo.repository.UtilisateurRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UtilisateurServiceImp implements UtilisateurService{
    private final UtilisateurRepository utilisateurRepository;

    public UtilisateurServiceImp(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    @Override
    public Utilisateur creer(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public List<Utilisateur> lire() {
        return utilisateurRepository.findAll();
    }

    @Override
    public Utilisateur modifier(long id, Utilisateur utilisateur) {
        return utilisateurRepository.findById(id)
                .map(u -> {
                    u.setNom(utilisateur.getNom());
                    u.setPrenom(utilisateur.getPrenom());
                    u.setTelephone(utilisateur.getTelephone());
                    u.setMotdepass(utilisateur.getMotdepass());
                    return utilisateurRepository.save(u);
                }).orElseThrow(() -> new RuntimeException(("Utilisateur non trouvé")));
    }

    @Override
    public String supprimer(long id) {
        utilisateurRepository.deleteById(id);
        return "Utilisateur supprimé";
    }
}
