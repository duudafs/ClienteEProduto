package com.mfs.cliente.services;

import com.mfs.cliente.models.ClienteModel;
import com.mfs.cliente.models.ProdutoModel;
import com.mfs.cliente.repository.ClienteRepository;
import com.mfs.cliente.repository.ProdutoRepository;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoModel> findAll(){
        return produtoRepository.findAll();
    }

    public ProdutoModel criarProduto(ProdutoModel produtoModel){
        return produtoRepository.save(produtoModel);
    }
}
