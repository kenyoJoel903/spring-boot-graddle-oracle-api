package com.spring.boot.graddle.oracle.springbootgraddleoracle.service;

import com.spring.boot.graddle.oracle.springbootgraddleoracle.entity.ReceiptDetails;

import java.util.List;

public interface IReceiptDetailsService {
    List<ReceiptDetails> findAll();
    ReceiptDetails findById(Long id);
    ReceiptDetails save(ReceiptDetails receipt);
    ReceiptDetails update(ReceiptDetails receipt);
    Long delete(Long id);
}