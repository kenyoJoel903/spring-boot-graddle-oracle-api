package com.spring.boot.graddle.oracle.springbootgraddleoracle.dao;

import com.spring.boot.graddle.oracle.springbootgraddleoracle.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienDAO extends JpaRepository<Client, Long> {
}