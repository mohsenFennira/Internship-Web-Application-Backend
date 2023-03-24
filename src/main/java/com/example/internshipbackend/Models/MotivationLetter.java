package com.example.internshipbackend.Models;

import com.example.internshipbackend.Models.enumm.CvType;

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
public class MotivationLetter {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String description;
    private Date CreationDate;
    @Enumerated(EnumType.STRING)
    private CvType cvType;
    @OneToMany(mappedBy = "motivationLetter")
    private List<Candidature>candidatureList;

}
