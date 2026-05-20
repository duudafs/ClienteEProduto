package com.mfs.cliente.services;

import com.mfs.cliente.models.ClienteModel;
import com.mfs.cliente.models.ProdutoModel;
import com.mfs.cliente.repository.ClienteRepository;
import com.mfs.cliente.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<ProdutoModel> findAll(){
        return clienteRepository.findAll();
    }

    public ClienteModel criarProduto(ProdutoModel produtoModel){
        return produtoRepository.save(produtoModel);
    }
}
