package com.example.keekit.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.keekit.model.entities.Aluno;
import com.example.keekit.service.AlunoService;

@RestController
public class AlunoController {
    private AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }
    
    @PostMapping
    public ResponseEntity<Aluno> create(@RequestBody Aluno aluno){
        return ResponseEntity
        .status(HttpStatus.CREATED)
        .body(alunoService.create(aluno));
    }

    @GetMapping
    public ResponseEntity<List<Aluno>> findAll(){
        return ResponseEntity.
        ok(alunoService.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Aluno> findById(@PathVariable Long id){
        return ResponseEntity.ok(alunoService.findById(id));
    }

    @PatchMapping
    public ResponseEntity<Aluno> update (@PathVariable Long  id, @RequestBody Aluno aluno){
        return ResponseEntity.ok(alunoService.update(id, aluno));
    }

    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        alunoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
