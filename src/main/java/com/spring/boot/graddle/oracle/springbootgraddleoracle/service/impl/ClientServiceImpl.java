package com.spring.boot.graddle.oracle.springbootgraddleoracle.service.impl;

import com.spring.boot.graddle.oracle.springbootgraddleoracle.dao.IClienDAO;
import com.spring.boot.graddle.oracle.springbootgraddleoracle.entity.Client;
import com.spring.boot.graddle.oracle.springbootgraddleoracle.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    private IClienDAO clienDAO;

    @Override
    public List<Client> findAll() {
        return clienDAO.findAll();
    }

    @Override
    public Client findById(Long id) {
        return clienDAO.findById(id).orElse(null);
    }

    @Override
    public Client save(Client client) {
        return clienDAO.save(client);
    }

    @Override
    public Client update(Client client) {
        return clienDAO.save(client);
    }

    @Override
    public Long delete(Long id) {
        clienDAO.deleteById(id);
        return id;
    }
}