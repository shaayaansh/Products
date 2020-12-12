package com.example.products.product;

import com.example.products.productOfferings.ProductOffering;
import org.hibernate.annotations.GenericGenerator;
import java.util.List;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    private String id;
    private String name;
    private String description;

    @ManyToMany
    private List<ProductOffering> productOfferings;

    public Product() {

    }

    public Product(String id, String name, String description) {
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
