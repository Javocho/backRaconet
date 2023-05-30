package com.example.raconet.professor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    @Autowired
    public List<Professor> getProfessors() {
        return professorRepository.findAll();
    }

    public void addNewProfessor(Professor professor) {
        Optional<Professor> professorExists = professorRepository.
                findProfessorByNameAndSurnameAndUniversityAndSchool(professor.getName(), professor.getSurname(), professor.getUniversity(), professor.getSchool());
        if (professorExists.isPresent()) {
            throw new IllegalStateException("professor repeated");
        }
        professorRepository.save(professor);
    }

    public void deleteProfessor(Long professorId) {
        boolean exists = professorRepository.existsById(professorId);
        if (!exists) {
            throw new IllegalStateException("professor with id " + professorId + " does not exists ");
        }
        professorRepository.deleteById(professorId);
    }
}
