package com.example.products.productOfferings;

import com.example.products.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductOfferingController {

    @Autowired
    private ProductOfferingService productOfferingService;


    @RequestMapping(value = "/productofferings")
    public List<ProductOffering> getAll(){
        return productOfferingService.getAll();
    }
    @RequestMapping(value = "/productofferings/{id}")
    public Optional<ProductOffering> getProductOffering(@PathVariable String id){
        return productOfferingService.getProductOffering(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/productofferings")
    public void addProductOffering(@RequestBody ProductOffering productOffering){
        productOfferingService.addProductOffering(productOffering);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/productofferings/{id}")
    public void updateProductOffering(@RequestBody ProductOffering productOffering, @PathVariable String id){
        productOfferingService.updateProductOffering(id, productOffering);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "productofferings/{id}")
    public void deleteProductOffering(@PathVariable String id){
        productOfferingService.deleteProductOffering(id);
    }
}
