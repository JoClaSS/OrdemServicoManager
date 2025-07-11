package com.br.os.controller;

import com.br.os.model.Cliente;
import com.br.os.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/cliente")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Cliente> cadastrarAtualizar(@RequestBody Cliente cliente) {
        clienteService.saveCliente(cliente);
        return ResponseEntity.ok(cliente);
    }


    @GetMapping
    public ResponseEntity<List<Cliente>> findCliente(@RequestParam(required = false) String nome,
                                                      @RequestParam(required = false) String cpf,
                                                      @RequestParam(required = false) String cnpj) {
        List<Cliente> clientes = clienteService.findCliente(nome, cpf, cnpj);
        return clientes.isEmpty()
                ? ResponseEntity.notFound().build()
                : ResponseEntity.ok(clientes);
    }



}
