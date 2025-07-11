package com.br.os.repository;

import com.br.os.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ItemRepository extends JpaRepository<Item,Long> {

//    Optional<Item> findByCodigo();
//    Optional<Item> findByNome();
//    Optional<Item> findByTipo();
//    Optional<Item> findByPreco();
}