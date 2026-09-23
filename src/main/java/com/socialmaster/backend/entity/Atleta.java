package com.socialmaster.backend.entity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import java.time.LocalDate;


@JsonPropertyOrder({
        "id",
        "name",
        "email",
        "dataNascimento",
        "faixa",
        "peso"
})

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


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getFaixa() {
        return faixa;
    }

    public void setFaixa(String faixa) {
        this.faixa = faixa;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}

