package com.mdalmeidaoliveira.herdcontrol.model;

import com.mdalmeidaoliveira.herdcontrol.model.enuns.AnimalStatus;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tagAnimal;
    private String tagLot;
    private AnimalStatus status;
    private String local;
    private String type;
    private String sex;
    private String breed;
    private String weight;
}
