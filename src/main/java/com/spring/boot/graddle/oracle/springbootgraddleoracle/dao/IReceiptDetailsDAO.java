package com.spring.boot.graddle.oracle.springbootgraddleoracle.dao;

import com.spring.boot.graddle.oracle.springbootgraddleoracle.entity.ReceiptDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReceiptDetailsDAO extends JpaRepository<ReceiptDetails, Long> {
}