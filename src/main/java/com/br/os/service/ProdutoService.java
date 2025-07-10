package com.br.os.service;

import com.br.os.model.Produto;
import com.br.os.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository pRepository;

    public void saveProduto(Produto produto){
        pRepository.saveAndFlush(produto);
    }

    public Optional<Produto> findByNome(String nome){
        Optional<Produto> byNome = pRepository.findByNome();
        return byNome;
    }



}
