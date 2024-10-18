package com.example.keekit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.keekit.model.entities.Aluno;

public interface  AlunoRepository extends JpaRepository<Aluno, Long> {
    
}
