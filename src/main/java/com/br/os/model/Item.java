package com.br.os.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long codigo;

    private String nome;

    private String descricao;

    private BigDecimal preco;

    private Integer quantidade;

    @Enumerated(EnumType.STRING)
    private TipoItem tipo; // PRODUTO ou SERVICO
}
