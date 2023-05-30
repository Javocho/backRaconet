package com.example.raconet.professor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    Optional<Professor> findProfessorByNameAndSurnameAndUniversityAndSchool(String name, String surname, String university, String school);
}
