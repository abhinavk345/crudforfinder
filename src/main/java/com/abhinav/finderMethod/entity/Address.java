package com.abhinav.finderMethod.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIgnoreProperties
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String wardNo;
    private  String block;
    private  String district;

    @OneToOne(cascade = CascadeType.ALL)
    private Division division;

    @JsonIgnore
    @OneToOne(mappedBy = "address")
    @JoinColumn(name = "id")
    private Employee employee;
}
