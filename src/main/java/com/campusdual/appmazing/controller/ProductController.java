package com.campusdual.appmazing.controller;

import com.campusdual.appmazing.api.iProductService;
import com.campusdual.appmazing.model.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    iProductService productService;
    @GetMapping
    public String testController(){
        return "Product controller works!";
    }
    @PostMapping
    public String testControllerBody(@RequestBody String name){
        return "Product controller works, " + name + "!";
    }
    @GetMapping(value = "/testMethod")
    public String testControllerMethod() {
        return "Product controller method works!";
    }
    @PostMapping (value="/get")
    public ProductDTO queryProduct(@RequestBody ProductDTO product){
        return this.productService.queryProduct(product);
    }

}
