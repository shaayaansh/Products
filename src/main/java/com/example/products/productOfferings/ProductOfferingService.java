package com.example.products.productOfferings;

import com.example.products.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductOfferingService {

    @Autowired
    private ProductOfferingRepository productOfferingRepository;

    public List<ProductOffering> getAll(){
        List<ProductOffering> productOfferings = new ArrayList<>();
        productOfferingRepository.findAll().forEach(productOfferings::add);
        return productOfferings;
    }

    public Optional<ProductOffering> getProductOffering(String id){
        return productOfferingRepository.findById(id);
    }

    public void addProductOffering(ProductOffering productOffering){
        productOfferingRepository.save(productOffering);
    }

    public void updateProductOffering(String id, ProductOffering productOffering){
        productOfferingRepository.save(productOffering);
    }

    public void deleteProductOffering(String id){
        productOfferingRepository.deleteById(id);
    }

}
