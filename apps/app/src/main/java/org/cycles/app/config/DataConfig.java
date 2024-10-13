package org.cycles.app.config;


import org.cycles.models.entities.Product;
import org.cycles.models.services.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.UUID;

@Configuration
@ComponentScan("org.cycles.models.services")
@EnableJpaRepositories(basePackages = "org.cycles.models.repositories")
@EntityScan("org.cycles.models.entities")
public class DataConfig {

    @Bean
    public CommandLineRunner dd(ProductService productService) {
        return args -> {
//            var product = new Product();
//            product.setName("Sample product");
//            product.setId(UUID.randomUUID());
//            productService.saveProduct(product);
        };
    }
}
