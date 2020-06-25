package com.spring.boot.graddle.oracle.springbootgraddleoracle.service;

import com.spring.boot.graddle.oracle.springbootgraddleoracle.entity.Client;

import java.util.List;

public interface IClientService {
    List<Client> findAll();
    Client findById(Long id);
    Client save(Client client);
    Client update(Client client);
    Long delete(Long id);
}