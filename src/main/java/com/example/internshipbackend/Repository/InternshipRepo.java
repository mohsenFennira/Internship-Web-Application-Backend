package com.example.internshipbackend.Repository;

import com.example.internshipbackend.Models.Internship;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternshipRepo extends CrudRepository<Internship,Long> {
}
