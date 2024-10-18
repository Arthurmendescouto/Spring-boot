package com.example.keekit.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.example.keekit.model.entities.Aluno;
import com.example.keekit.repository.AlunoRepository;
import com.example.keekit.service.AlunoService;


@Service
public class AlunoServiceImpl implements AlunoService{

    private AlunoRepository alunoRepository;

    public AlunoServiceImpl(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    
    };

    @Override
    public Aluno create(Aluno aluno) {
        Aluno createdAluno=alunoRepository.save(aluno);    
        return createdAluno;
    }

    @Override
    public List<Aluno> findAll() {
    return alunoRepository.findAll();
    }

    @Override
    public Aluno findById(Long id) {
        return alunoRepository.findById(id).get();
    }

    @Override
    public List<Aluno> FindByName(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Aluno update(Long id, Aluno aluno) {
        Aluno foundAluno=alunoRepository.findById(id).get();

        BeanUtils.copyProperties(aluno, foundAluno);

        return alunoRepository.save(foundAluno);
    }

    @Override
    public void delete(Long id) {
        Aluno foundAluno = alunoRepository.findById(id).get();

        alunoRepository.delete(foundAluno);
    }
    
}
