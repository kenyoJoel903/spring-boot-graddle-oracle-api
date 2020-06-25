package com.spring.boot.graddle.oracle.springbootgraddleoracle.service.impl;

import com.spring.boot.graddle.oracle.springbootgraddleoracle.dao.IReceiptDetailsDAO;
import com.spring.boot.graddle.oracle.springbootgraddleoracle.entity.ReceiptDetails;
import com.spring.boot.graddle.oracle.springbootgraddleoracle.service.IReceiptDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceiptDetailsServiceImpl implements IReceiptDetailsService {

    @Autowired
    private IReceiptDetailsDAO receiptDetailsDAO;

    @Override
    public List<ReceiptDetails> findAll() {
        return receiptDetailsDAO.findAll();
    }

    @Override
    public ReceiptDetails findById(Long id) {
        return receiptDetailsDAO.findById(id).orElse(null);
    }

    @Override
    public ReceiptDetails save(ReceiptDetails receipt) {
        return receiptDetailsDAO.save(receipt);
    }

    @Override
    public ReceiptDetails update(ReceiptDetails receipt) {
        return receiptDetailsDAO.save(receipt);
    }

    @Override
    public Long delete(Long id) {
        receiptDetailsDAO.deleteById(id);
        return id;
    }
}