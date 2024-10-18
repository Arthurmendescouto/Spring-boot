package com.example.keekit.service;

import java.util.List;

import com.example.keekit.model.entities.Aluno;

public interface  AlunoService {
    public Aluno create(Aluno aluno);
    public List<Aluno> findAll();

    public Aluno findById(Long id);
    public List<Aluno> FindByName(String name);

    public Aluno update(Long id,Aluno aluno);
    public void delete(Long id);
}
