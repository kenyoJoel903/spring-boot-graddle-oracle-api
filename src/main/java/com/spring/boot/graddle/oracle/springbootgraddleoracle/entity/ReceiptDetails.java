package com.spring.boot.graddle.oracle.springbootgraddleoracle.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="TBL_RECEIPT_DETAILS", schema = "REACT")
public class ReceiptDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DETAILORDERLIST_SEQ")
    @SequenceGenerator(sequenceName = "detailorderlist_sequence", allocationSize = 1, name = "DETAILORDERLIST_SEQ")
    private Long id;
    @Column(name="account")
    private String account;
    @Column(name="description")
    private String description;
    @Column(name="unit_price")
    private String unitPrice;
    @Column(name="amount")
    private String amount;

    @Column(name = "RECEIPT_ID")
    private Long receipt;
}