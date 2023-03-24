package com.example.internshipbackend.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Date;

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
}
