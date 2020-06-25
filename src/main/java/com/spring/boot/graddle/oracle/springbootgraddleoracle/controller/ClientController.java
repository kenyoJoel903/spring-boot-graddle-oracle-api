package com.spring.boot.graddle.oracle.springbootgraddleoracle.controller;

import com.spring.boot.graddle.oracle.springbootgraddleoracle.entity.Client;
import com.spring.boot.graddle.oracle.springbootgraddleoracle.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClientController {

    @Autowired
    private IClientService clientService;

    @GetMapping("/clients")
    public List<Client> findAllClients() {
        return clientService.findAll();
    }
}