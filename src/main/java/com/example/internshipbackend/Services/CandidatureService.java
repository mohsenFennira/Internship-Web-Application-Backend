package com.example.internshipbackend.Services;

import com.example.internshipbackend.Models.*;
import com.example.internshipbackend.Repository.*;
import com.example.internshipbackend.Services.IService.CandidatureIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CandidatureService implements CandidatureIService {
    @Autowired
    CandidatureRepo cr;
    @Autowired
    UserRepo ur;
    @Autowired
    CVRepo cvr;
    @Autowired
    MotivatiionLetterRepo ml;
    @Autowired
    InternshipRepo ir;
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

    @Override
    public Candidature assignCandidaturetoInternshipandMotivationLetterAndCv(Candidature candidature, Long idMotivationLetter, Long idCV, Long idInternship) {
        Candidature candidature1=cr.save(candidature);
        MotivationLetter motivationLetter=ml.findById(idMotivationLetter).get();
        CV cv=cvr.findById(idCV).get();
        User user=ur.findById(1L).get();
        Internship internship=ir.findById(idInternship).get();
        ///////
        candidature1.setMotivationLetter(motivationLetter);
        candidature1.setCv(cv);
        candidature1.setUser(user);
        ///////
        List<Internship> internshipList = candidature1.getInternshipList();
        if(internshipList == null){
            internshipList = new ArrayList<Internship>();
        }
        internshipList.add(internship);
        candidature1.setInternshipList(internshipList);
        return cr.save(candidature1);
    }
}
