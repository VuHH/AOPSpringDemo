package com.demo.demo.controller;

import com.demo.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/getProduct/{id}")
    public String getProduct(@PathVariable String id) {
        return productService.getProductId(id);

    }

    @GetMapping("/addProduct/{productName}")
    public String addProduct(@PathVariable String productName) {
        return productService.addProduct(productName);
    }
}
