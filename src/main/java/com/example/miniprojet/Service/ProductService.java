package com.example.miniprojet.Service;

import com.example.miniprojet.Entity.Product;
import com.example.miniprojet.Entity.ProductCategory;
import com.example.miniprojet.Repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    IProductRepo iProductRepo;
    public String addAProduct(Product product){
        iProductRepo.save(product);
        return "Product added ";
    }

    public List<Product> getProducts(){
        return (List<Product>) iProductRepo.findAll();
    }

    public Optional<Product> getProduct(Integer id){
        return iProductRepo.findById(id);
    }

    public List<Product> getProductByCategory(ProductCategory category){
        return iProductRepo.findByProductCategory(category);
    }

    public String addListOfProducts(List<Product> products){
        iProductRepo.saveAll(products);
        return "Products are added ";
    }

    public String deleteProductById(Integer id){
        iProductRepo.deleteById(id);
        return "Product removed ";
    }
    public String updateProduct(Integer id, Product updatedProduct){
        Product udpatedProduct = iProductRepo.findById(id).orElse(null);
        if (udpatedProduct == null) {
            return "Product not found ";
        }
        udpatedProduct.setProductCategory(udpatedProduct.getProductCategory());
        udpatedProduct.setProductName(udpatedProduct.getProductName());
        udpatedProduct.setProductPrice(udpatedProduct.getProductPrice());
        udpatedProduct.setProductDesc(udpatedProduct.getProductDesc());
        udpatedProduct.setProductBrand(updatedProduct.getProductBrand());
        iProductRepo.save(udpatedProduct);

        return "Product updated ";
    }
}
