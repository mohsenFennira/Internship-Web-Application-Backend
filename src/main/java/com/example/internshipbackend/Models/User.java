package com.example.internshipbackend.Models;

import com.example.internshipbackend.Models.enumm.RoleType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String speciality;
    @Enumerated(EnumType.STRING)
    private RoleType roleType;
    @OneToMany(mappedBy = "user")
    private List<Candidature> candidatureList;
}



