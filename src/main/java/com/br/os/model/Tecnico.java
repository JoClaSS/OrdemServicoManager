package com.br.os.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tecnicos")
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String especialidade;
}

