package com.demo.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class ProductService {

    private static final Logger logger = LoggerFactory.getLogger(ProductService.class);

    public String getProductId(String id) {
        logger.info("Fetching product with ID: {}", id);
        return "Get Product with Id:" + id;
    }

    public String addProduct(String productName) {
        logger.info("Adding product: {}", productName);
        return "Add Product with productName:" + productName;
    }
}
