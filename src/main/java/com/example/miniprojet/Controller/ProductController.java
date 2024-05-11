package com.example.miniprojet.Controller;

import com.example.miniprojet.Entity.Product;
import com.example.miniprojet.Entity.ProductCategory;
import com.example.miniprojet.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    //Post
    @PostMapping("product")
    public String addAProduct(@RequestBody Product product)
    {
        return  productService.addAProduct(product);
    }

    @PostMapping("products")
    public String addListOfProducts(@RequestBody List<Product> products) {return productService.addListOfProducts(products);}

    @PutMapping("product/{id}")
    public String updateProduct(@PathVariable Integer id, @RequestBody Product product)
    {
        return productService.updateProduct(id, product);
    }
    @GetMapping("product/{Id}")
    public Optional<Product> getProduct(@PathVariable Integer Id)
    {
        return productService.getProduct(Id);
    }

    @GetMapping("products")
    public List<Product> getProducts()
    {
        return productService.getProducts();
    }
    @GetMapping("products/{category}")
    public List<Product> getProductsByCategory(@PathVariable ProductCategory category)
    {
        return productService.getProductByCategory(category);
    }
    @DeleteMapping("product/{id}")
    public String deleteProductById(@PathVariable Integer id)
    {
        return productService.deleteProductById(id);
    }


}