package com.br.os.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private char sexo;
    private String cpf;
    private String cnpj;
    private String email;
    private String telefone;
    private String endereco;
}
