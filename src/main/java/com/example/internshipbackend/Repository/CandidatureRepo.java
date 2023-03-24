package com.example.internshipbackend.Repository;

import com.example.internshipbackend.Models.Candidature;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatureRepo extends CrudRepository<Candidature,Long> {
}
