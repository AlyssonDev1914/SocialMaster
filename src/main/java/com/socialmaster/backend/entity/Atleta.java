package com.socialmaster.backend.entity;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;


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

    @NotBlank(message = "O nome não pode ficar vazio")
    private String nome;

    @NotBlank
    @Email
    private String email;

    //Data de nascimento do atleta
    @NotNull
    private LocalDate dataNascimento;

    @NotNull
    @Enumerated (EnumType.STRING)
    private Faixa faixa;

    @NotNull
    @Positive
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

    public Faixa getFaixa() {
        return faixa;
    }

    public void setFaixa(Faixa faixa) {
        this.faixa = faixa;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}

