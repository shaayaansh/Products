package com.example.products.productOfferings;

import com.example.products.priceplans.PricePlan;
import com.example.products.product.Product;

import javax.persistence.*;
import java.util.List;


@Entity
public class ProductOffering {
    @Id
    private String id;
    private String name;
    private String description;
    @OneToMany()
    private List<PricePlan> pricePlans;

    @ManyToMany()
    private List<Product> products;

    public ProductOffering() {
    }

    public ProductOffering(String id, String name, String description) {
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
