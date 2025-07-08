package com.br.os.model;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeProduto;
    private Integer quantidade;
    private BigDecimal precoUnitario;

    @ManyToOne
    @JoinColumn(name = "ordem_id")
    private OrdemServico ordem;
}

