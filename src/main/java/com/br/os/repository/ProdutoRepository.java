package com.br.os.repository;


import com.br.os.model.OrdemServico;
import com.br.os.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Optional<Produto> findByNome();
    Optional<Produto> findByPrecoUnitario();
    Optional<Produto> findByItem();
    Optional<Produto> findByOrdemServico();
    Optional<Produto> findByTecnico();

}

