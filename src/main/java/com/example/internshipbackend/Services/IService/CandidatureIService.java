package com.example.internshipbackend.Services.IService;

import com.example.internshipbackend.Models.Candidature;
import com.example.internshipbackend.Models.MotivationLetter;

import java.util.List;

public interface CandidatureIService {
    public Candidature addCandidature(Candidature candidature);
    public Candidature updateCandidature(Candidature candidature);
    public void DeleteCandidature(Long idCandidature);
    public Candidature retrieveCandidatureById(Long idCandidature);
    public List<Candidature> retrieveAllCandidature();
    public Candidature assignCandidaturetoInternshipandMotivationLetterAndCv(Candidature candidature, Long idMotivationLetter,Long idCV,Long idInternship);

}
