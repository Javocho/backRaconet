package com.example.raconet.professor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/professor")
public class ProfessorController {
    private final ProfessorService professorService;

    //qué es la inyección de dependencias y por qué tengo que poner @Service al service sino función en rojo y @autowired
    @Autowired
    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @GetMapping
    public List<Professor> getProfessors() {
        return professorService.getProfessors();
    }

    @PostMapping
    public void addNewProfessor(@RequestBody Professor professor) {
        professorService.addNewProfessor(professor);
    }

    @DeleteMapping(path = "{professorId}")
    public void deleteProfessor(@PathVariable("professorId") Long professorId) {
        professorService.deleteProfessor(professorId);
    }
}