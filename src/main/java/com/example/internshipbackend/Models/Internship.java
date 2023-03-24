package com.example.internshipbackend.Models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Internship implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String nameCompany;
    private String Domaine;
    private String description;
    private String typeInternship;
    private Date dateInternshipBeginnig;
    private Date dateInternshipEnd;
    private String SkillsTechnical;
    private String required;
    @ManyToMany(mappedBy = "internshipList")
    private List<Candidature>candidatures;

}
