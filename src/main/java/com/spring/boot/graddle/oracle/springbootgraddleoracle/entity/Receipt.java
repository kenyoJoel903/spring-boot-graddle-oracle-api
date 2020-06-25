package com.spring.boot.graddle.oracle.springbootgraddleoracle.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="TBL_RECEIPT", schema = "REACT")
public class Receipt {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "receipt_sequence")
    @SequenceGenerator(name = "receipt_sequence", allocationSize = 1, sequenceName = "receipt_sequence")
    private Long id;
    @Column(name="date_creation")
    private String date;
    @Column(name="obs_receipt")
    private String observation;
    @Column(name="price_total")
    private String priceTotal;
    @Column(name="number_receipt")
    private String numberOrderList;
    @Column(name="state_receipt")
    private String stateOrderList;
    @Column(name = "CLIENT_ID")
    private Long clientId;

    @OneToMany
    @JoinColumn(name="RECEIPT_ID", referencedColumnName="id")
    private List<ReceiptDetails> receiptDetails;

}