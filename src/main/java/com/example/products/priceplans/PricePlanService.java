package com.example.products.priceplans;

import com.example.products.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PricePlanService {
    @Autowired
    private PricePlanRepository pricePlanRepository;

    public List<PricePlan> getAll(){
        List<PricePlan> pricePlans = new ArrayList<>();
        pricePlanRepository.findAll().forEach(pricePlans::add);
        return pricePlans;
    }

    public Optional<PricePlan> getPricePlan(String id){
        return pricePlanRepository.findById(id);
    }

    public void addPricePlan(PricePlan pricePlan){
        pricePlanRepository.save(pricePlan);
    }

    public void updatePricePlan(String id, PricePlan pricePlan){
        pricePlanRepository.save(pricePlan);
    }

    public void deletePricePlan(String id){
        pricePlanRepository.deleteById(id);
    }

}
