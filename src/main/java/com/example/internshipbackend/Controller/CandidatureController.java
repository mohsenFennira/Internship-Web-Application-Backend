package com.example.internshipbackend.Controller;

import com.example.internshipbackend.Models.Candidature;
import com.example.internshipbackend.Services.IService.CandidatureIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CandidatureController {
    @Autowired
    CandidatureIService cis;
    @PostMapping("addCandidature")
    public Candidature addCandidature(@RequestBody Candidature candidature) {
        return cis.addCandidature(candidature);
    }

    @PutMapping("updateCandidature")
    public Candidature updateCandidature(@RequestBody Candidature candidature) {
        return cis.updateCandidature(candidature);
    }

    @DeleteMapping("DeleteCandidature")
    public void DeleteCandidature(@RequestParam Long idCandidature) {
        cis.DeleteCandidature(idCandidature);
    }

    @GetMapping("retrieveCandidatureById")
    public Candidature retrieveCandidatureById(@RequestParam Long idCandidature) {
        return cis.retrieveCandidatureById(idCandidature);
    }

    @GetMapping("retrieveAllCandidature")
    public List<Candidature> retrieveAllCandidature() {
        return cis.retrieveAllCandidature();
    }

}
