package com.zorba.billingsoftware.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Category {

    @Id
    private Integer categoryId;

    private String categoryName;

    @OneToMany
    private List<Items> items;

}
