package com.br.os.repository;

import com.br.os.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Optional<Cliente> findByCpf(String cpf);
    Optional<Cliente> findByCnpj(String cnpj);
    Optional<Cliente> findByNome(String nome);
    Optional<Cliente> findByTelefone(String telefone);
    Optional<Cliente> findByEmail(String email);
}
