package com.example.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class ProductController {
    private ProductRepository productRepository;

    ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;

    }
    @GetMapping("/index")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    @GetMapping("/getProducts")
    public String getProducts(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "getProducts";
    }
    
    
}
