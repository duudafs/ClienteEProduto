package com.mfs.cliente.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="TBL_CLIENTE")
public class ClienteModel {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;

    @OneToMany
    private List <ProdutoModel> produtoModels;

    public ClienteModel(Long id, String nome, List<ProdutoModel> produtoModels) {
        this.id = id;
        this.nome = nome;
        this.produtoModels = produtoModels;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ProdutoModel> getProdutoModels() {
        return produtoModels;
    }

    public void setProdutoModels(List<ProdutoModel> produtoModels) {
        this.produtoModels = produtoModels;
    }
}
