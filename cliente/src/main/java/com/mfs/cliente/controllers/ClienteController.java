package com.mfs.cliente.controllers;

import com.mfs.cliente.models.ClienteModel;
import com.mfs.cliente.repository.ClienteRepository;
import com.mfs.cliente.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    List<ClienteModel> findAll(){
        return clienteService.findAll();
    }
    @PostMapping
    public ClienteModel criarCliente(@RequestBody ClienteModel clienteModel){
        return clienteService.criarCliente(clienteModel);
    }

}
