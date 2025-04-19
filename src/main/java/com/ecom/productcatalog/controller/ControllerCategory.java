package com.ecom.productcatalog.controller;

import com.ecom.productcatalog.model.Category;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.ecom.productcatalog.service.ServiceCategory; // Ensure this import exists

@RestController
@RequestMapping("/api/categories")
@CrossOrigin(origins = "http://localhost:5173/")
public class ControllerCategory {

    private final ServiceCategory serviceCategory;

    public ControllerCategory(ServiceCategory serviceCategory) {
        this.serviceCategory = serviceCategory;
    }

    @GetMapping
    public List<Category> getAllCategories(){
        return serviceCategory.getAllCategories();
    }
}