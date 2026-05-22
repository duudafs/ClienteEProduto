package com.mfs.cliente.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="TBL_PRODUTOS")
public class ProdutoModel {

    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String nome;

    @ManyToOne
    private ClienteModel clienteModel;

    public ProdutoModel(Long id, String nome, ClienteModel clienteModel) {
        this.id = id;
        this.nome = nome;
        this.clienteModel = clienteModel;
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

    public ClienteModel getClienteModel() {
        return clienteModel;
    }

    public void setClienteModel(ClienteModel clienteModel) {
        this.clienteModel = clienteModel;
    }
}
