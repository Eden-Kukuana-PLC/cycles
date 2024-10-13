package org.cycles.app.controllers;


import org.cycles.models.entities.Product;
import org.cycles.models.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PublicController {

    private final ProductService productService;

    public PublicController(ProductService productService) {

        this.productService = productService;
    }

    @GetMapping("/hello")
    public List<Product> index() {
        return productService.getProducts();
    }
}
