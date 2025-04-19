package com.ecom.productcatalog.service;

import com.ecom.productcatalog.model.Category;
import com.ecom.productcatalog.repository.repositoryCategory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCategory {
    private final repositoryCategory repositoryCategory;

    public ServiceCategory(repositoryCategory repositoryCategory) {
        this.repositoryCategory = repositoryCategory;
    }

    public List<Category> getAllCategories() {
        return repositoryCategory.findAll();
    }
}
