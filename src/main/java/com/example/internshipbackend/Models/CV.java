package com.example.internshipbackend.Models;

import com.example.internshipbackend.Models.enumm.RoleType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CV {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String cvPdf;
    @Enumerated(EnumType.STRING)
    private RoleType roleType;
    @OneToMany(mappedBy = "cv")
    private List<Candidature>candidatureList;

}
