package com.example.internshipbackend.Services;

import com.example.internshipbackend.Models.Candidature;
import com.example.internshipbackend.Repository.CandidatureRepo;
import com.example.internshipbackend.Services.IService.CandidatureIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatureService implements CandidatureIService {
    @Autowired
    CandidatureRepo cr;
    @Override
    public Candidature addCandidature(Candidature candidature) {
        return cr.save(candidature);
    }

    @Override
    public Candidature updateCandidature(Candidature candidature) {
        return cr.save(candidature);
    }

    @Override
    public void DeleteCandidature(Long idCandidature) {
           cr.deleteById(idCandidature);
    }

    @Override
    public Candidature retrieveCandidatureById(Long idCandidature) {
        return cr.findById(idCandidature).get();
    }

    @Override
    public List<Candidature> retrieveAllCandidature() {
        return (List<Candidature>) cr.findAll();
    }
}
