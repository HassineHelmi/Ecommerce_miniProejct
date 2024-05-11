package com.example.miniprojet.Repository;

import com.example.miniprojet.Entity.Product;
import com.example.miniprojet.Entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepo extends JpaRepository<Product,Integer> {
    List<Product> findByProductCategory(ProductCategory category);
}
