package com.br.os.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "servicos_prestados")
public class ServicoPrestado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private BigDecimal preco;

    @ManyToOne
    @JoinColumn(name = "ordem_id")
    private OrdemServico ordem;
}
