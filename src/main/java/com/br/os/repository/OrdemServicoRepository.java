package com.br.os.repository;

import com.br.os.model.Cliente;
import com.br.os.model.OrdemServico;
import com.br.os.model.Prioridade;
import com.br.os.model.StatusOrdem;
import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.Optional;

public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Long> {

    Optional<OrdemServico> findByCodigo();
    Optional<OrdemServico> findByDescricao();
    Optional<OrdemServico> findByStatus();
    Optional<OrdemServico> findByPrioridade();
    Optional<OrdemServico> findByDataCriacao();
    Optional<OrdemServico> findByDataConclusão();
    Optional<OrdemServico> findByCliente();
    Optional<OrdemServico> findByCriadoPor();

}

