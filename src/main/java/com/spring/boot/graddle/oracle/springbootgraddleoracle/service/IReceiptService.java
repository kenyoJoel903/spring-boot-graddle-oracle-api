package com.spring.boot.graddle.oracle.springbootgraddleoracle.service;

import com.spring.boot.graddle.oracle.springbootgraddleoracle.entity.Receipt;

import java.util.List;

public interface IReceiptService {
    List<Receipt> findAll();
    Receipt findById(Long id);
    Receipt save(Receipt receipt);
    Receipt update(Receipt receipt);
    Long delete(Long id);
}