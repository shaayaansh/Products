package com.example.products.priceplans;


import com.example.products.productOfferings.ProductOffering;

import javax.persistence.*;

@Entity
public class PricePlan {
    @Id
    private String id;
    private String name;
    private String description;

    @ManyToOne
    //@JoinColumn(name = "product_offering_id")
    private ProductOffering productOffering;

    public PricePlan() {
    }

    public PricePlan(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
