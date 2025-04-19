package com.ecom.productcatalog.repository;

import com.ecom.productcatalog.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoryCategory extends JpaRepository<Category, Long> {

}
