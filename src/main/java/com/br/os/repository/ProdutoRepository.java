package com.br.os.repository;


import com.br.os.model.Item;
import com.br.os.model.OrdemServico;
import com.br.os.model.Produto;
import com.br.os.model.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Optional<Produto> findByNome(String nome);
//    Optional<Produto> findByPrecoUnitario(BigDecimal preco);
//    Optional<Produto> findByItem(Item item);
//    Optional<Produto> findByOrdemServico(OrdemServico os);
//    Optional<Produto> findByTecnico(Tecnico tecnico);

}

