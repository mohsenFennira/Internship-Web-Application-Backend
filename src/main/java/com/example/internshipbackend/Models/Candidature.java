package com.example.internshipbackend.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Candidature {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private Date CreationDate;
    @ManyToOne
    private User user;
    @ManyToMany
    private List<Internship>internshipList;
    @ManyToOne
    private MotivationLetter motivationLetter;
    @ManyToOne
    private CV cv;

}
