package com.example.internshipbackend.Repository;

import com.example.internshipbackend.Models.MotivationLetter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotivatiionLetterRepo extends CrudRepository<MotivationLetter,Long > {
}
