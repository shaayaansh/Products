package com.example.products.priceplans;

import com.example.products.productOfferings.ProductOffering;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PricePlanController {
    @Autowired
    private PricePlanService pricePlanService;

    @RequestMapping(value = "/priceplans")
    public List<PricePlan> getAll(){
        return pricePlanService.getAll();
    }
    @RequestMapping(value = "/priceplans/{id}")
    public Optional<PricePlan> getPricePlan(@PathVariable String id){
        return pricePlanService.getPricePlan(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/priceplans")
    public void addPricePlan(@RequestBody PricePlan pricePlan){
        pricePlanService.addPricePlan(pricePlan);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/priceplans/{id}")
    public void updatePricePlan(@RequestBody PricePlan pricePlan, @PathVariable String id){
        pricePlanService.updatePricePlan(id, pricePlan);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "priceplans/{id}")
    public void deletePricePlan(@PathVariable String id){
        pricePlanService.deletePricePlan(id);
    }
}
