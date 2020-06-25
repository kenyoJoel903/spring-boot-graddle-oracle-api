package com.spring.boot.graddle.oracle.springbootgraddleoracle.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TBL_CLIENT", schema = "REACT")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CLIENT_SEQ")
    @SequenceGenerator(sequenceName = "client_sequence", allocationSize = 1, name = "CLIENT_SEQ")
    private Long id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="age")
    private String age;
    @Column(name="dni")
    private String dni;
    @Column(name="email")
    private String email;
    @Column(name="ruc")
    private String ruc;
    @Column(name="address")
    private String address;
    @OneToMany
    @JoinColumn(name="CLIENT_ID", referencedColumnName="id")
    private List<Receipt> receipts;
}