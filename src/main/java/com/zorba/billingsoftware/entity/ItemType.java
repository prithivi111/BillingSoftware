package com.zorba.billingsoftware.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ItemType {

    @Id
    private Integer itemTypeId;
    private String service;
    private String product;


}
