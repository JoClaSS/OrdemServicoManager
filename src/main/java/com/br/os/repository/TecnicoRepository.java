package com.br.os.repository;

import com.br.os.model.Produto;
import com.br.os.model.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TecnicoRepository extends JpaRepository<Tecnico, Long> {

    Optional<Tecnico> findByNome();

}

