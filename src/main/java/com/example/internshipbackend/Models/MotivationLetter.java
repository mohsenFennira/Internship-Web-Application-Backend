package com.example.internshipbackend.Models;

import com.example.internshipbackend.Models.enumm.CvType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
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

}
