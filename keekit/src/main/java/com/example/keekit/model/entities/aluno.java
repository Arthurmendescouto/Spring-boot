package com.example.keekit.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Aluno")
public class Aluno {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="first_name",length=50)
    private String firstName;
    @Column(name="last_name",length=50)
    private String lastName;

    @Column(length=11,nullable=false, unique=true)
    private String cpf;

    @Column(name="registration_number",length=12, nullable=false, unique=true)
    private String registrationNumber;
    
    
}
