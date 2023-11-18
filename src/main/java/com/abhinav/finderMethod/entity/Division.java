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

public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String divName;
    @JsonIgnore
    @OneToOne(mappedBy = "division")
    private Address address;

}
