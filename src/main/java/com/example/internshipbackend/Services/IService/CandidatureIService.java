package com.example.internshipbackend.Services.IService;

import com.example.internshipbackend.Models.Candidature;

import java.util.List;

public interface CandidatureIService {
    public Candidature addCandidature(Candidature candidature);
    public Candidature updateCandidature(Candidature candidature);
    public void DeleteCandidature(Long idCandidature);
    public Candidature retrieveCandidatureById(Long idCandidature);
    public List<Candidature> retrieveAllCandidature();

}
