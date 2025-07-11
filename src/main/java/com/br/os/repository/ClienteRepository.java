package com.br.os.repository;

import com.br.os.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Optional<Cliente> findByCpf(String cpf);
    Optional<Cliente> findByCnpj(String cnpj);
    Optional<Cliente> findByNome(String nome);
    Optional<Cliente> findByTelefone(String telefone);
    Optional<Cliente> findByEmail(String email);

    @Query("SELECT c FROM Cliente c WHERE " +
            "(:nome IS NULL OR LOWER(c.nome) LIKE LOWER(CONCAT('%', :nome, '%'))) AND " +
            "(:cpf IS NULL OR c.cpf = :cpf) AND" +
            "(:cnpj IS NULL OR c.cnpj = :cnpj)")
    List<Cliente> buscarCliente(@Param("nome") String nome, @Param("cpf") String cpf, @Param("cnpj") String cnpj);
}


