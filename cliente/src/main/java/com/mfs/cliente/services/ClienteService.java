package com.mfs.cliente.services;

import com.mfs.cliente.models.ClienteModel;
import com.mfs.cliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteModel> findAll(){
        return clienteRepository.findAll();
    }
    public ClienteModel criarCliente(ClienteModel clienteModel){
        return clienteRepository.save(clienteModel);
    }

}
