package com.zorba.billingsoftware.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Entity
public class Items {

    @Id
    private Integer itemId;

    private String itemName;

    @OneToOne
    private ItemType itemType;

    private String units;
    private Double salesPrice;
    private Double purchasePrice;
    private Double MRP;
    private Integer HSNCode;
    private Date entryOfProduct;

    private Integer productQuantity;

    private String description;

    @ManyToOne
    private Category category;

}
