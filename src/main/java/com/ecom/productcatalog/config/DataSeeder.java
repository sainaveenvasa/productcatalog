package com.ecom.productcatalog.config;

import com.ecom.productcatalog.model.Category;
import com.ecom.productcatalog.model.Product;
import com.ecom.productcatalog.repository.ProductRepository;
import com.ecom.productcatalog.repository.repositoryCategory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component

public class DataSeeder implements CommandLineRunner {
    private final ProductRepository productRepository;
    private final repositoryCategory repositoryCategory;

    public DataSeeder(ProductRepository productRepository, repositoryCategory repositoryCategory) {
        this.productRepository = productRepository;
        this.repositoryCategory = repositoryCategory;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("🔧 DataSeeder running...");
        //clear all existing data
        productRepository.deleteAll();
        repositoryCategory.deleteAll();

        //create categories
        Category electronics = new Category();
        electronics.setName("Electronics");
        Category clothing = new Category();
        clothing.setName("Clothing");
        Category home = new Category();
        home.setName("Home");
        repositoryCategory.saveAll(Arrays.asList(electronics,clothing,home));


        //create products
        Product phone = new Product();
        phone.setName("SmartPhone");
        phone.setDescription("iphone 16 pro max");
        phone.setImageUrl("https://placehold.co/600x400");
        phone.setPrice(1999.99);
        phone.setCategory(electronics);

        Product laptop = new Product();
        laptop.setName("laptop");
        laptop.setDescription("hig performace for work and playing");
        laptop.setImageUrl("https://placehold.co/600x400");
        laptop.setPrice(109999.99);
        laptop.setCategory(electronics);

        Product shirt = new Product();
        shirt.setName("t-Sirt");
        shirt.setDescription("levis t-shirts");
        shirt.setImageUrl("https://placehold.co/600x400");
        shirt.setPrice(199.99);
        shirt.setCategory(clothing);

        Product blender = new Product();
        blender.setName("smartblender");
        blender.setDescription("blenders for smoothies");
        blender.setImageUrl("https://placehold.co/600x400");
        blender.setPrice(899.99);
        blender.setCategory(home);

        productRepository.saveAll(Arrays.asList(phone,laptop,shirt,blender));

    }
}
