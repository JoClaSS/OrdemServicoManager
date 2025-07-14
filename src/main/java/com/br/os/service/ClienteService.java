package com.br.os.service;

import com.br.os.Exception.ResourceNotFoundException;
import com.br.os.model.Cliente;
import com.br.os.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository cRepository;


    public Optional<Cliente> findById(Long id) {
        return cRepository.findById(id);
    }

    public Optional<Cliente> findByCpf(String cpf) {
        return cRepository.findByCpf(cpf);
    }

    public Optional<Cliente> findByCnpj(String cnpj) {
        return cRepository.findByCnpj(cnpj);
    }

    public List<Cliente> findCliente(String nome, String cpf, String cnpj) {
        return cRepository.buscarCliente(nome,cpf,cnpj);
    }

    public Optional<Cliente> findByTelefone(String telefone) {
        return cRepository.findByTelefone(telefone);
    }

    public Optional<Cliente> findByEmail(String email) {
        return cRepository.findByEmail(email);
    }

    public void saveCliente(Cliente cliente){
        cRepository.saveAndFlush(cliente);
    }

    public void deleteCliente(Long id){ cRepository.deleteById(id);}

    public void atualizarCliente(Long id, Cliente updatedCliente){
            Cliente cliente = cRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Cliente não encontrado"));
            cliente.atualizarCliente(updatedCliente);
            cRepository.saveAndFlush(cliente);
    }
}
