package com.socialmaster.backend.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "atletas")
public class Atleta {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private String email;

    private LocalDate dataNascimento;

    private String faixa;

    private Double peso;



}

