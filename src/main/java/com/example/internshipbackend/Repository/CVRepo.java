package com.example.internshipbackend.Repository;

import com.example.internshipbackend.Models.CV;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CVRepo extends CrudRepository<CV,Long> {
}
