package com.br.os.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "ordens_servico")
public class OrdemServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private StatusOrdem status;

    @Enumerated(EnumType.STRING)
    private Prioridade prioridade;

    private LocalDateTime dataCriacao;
    private LocalDateTime dataConclusao;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "tecnico_id")
    private Tecnico tecnico;

    @Column(name = "criado_por")
    private Long criadoPor; // ID do usuário do AuthManager
}
