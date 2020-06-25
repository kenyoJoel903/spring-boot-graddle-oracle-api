package com.spring.boot.graddle.oracle.springbootgraddleoracle.service.impl;

import com.spring.boot.graddle.oracle.springbootgraddleoracle.dao.IReceiptDAO;
import com.spring.boot.graddle.oracle.springbootgraddleoracle.entity.Receipt;
import com.spring.boot.graddle.oracle.springbootgraddleoracle.service.IReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceiptServiceImpl implements IReceiptService {

    @Autowired
    private IReceiptDAO receiptDAO;

    @Override
    public List<Receipt> findAll() {
        return receiptDAO.findAll();
    }

    @Override
    public Receipt findById(Long id) {
        return receiptDAO.findById(id).orElse(null);
    }

    @Override
    public Receipt save(Receipt receipt) {
        return receiptDAO.save(receipt);
    }

    @Override
    public Receipt update(Receipt receipt) {
        return receiptDAO.save(receipt);
    }

    @Override
    public Long delete(Long id) {
        receiptDAO.deleteById(id);
        return id;
    }
}