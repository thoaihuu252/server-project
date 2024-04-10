package com.itboy.DACNPM.Service.Imp;

import com.itboy.DACNPM.Model.Product;
import com.itboy.DACNPM.Repository.ProductRepository;
import com.itboy.DACNPM.Service.Interface.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImp implements ProductService {
    @Autowired
    private ProductRepository productReposity;
    @Override
    public Product saveProduct(Product product) {
        return productReposity.save(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return productReposity.findAll();
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        return productReposity.findById(id);
    }

    @Override
    public void deleteProduct(Long id) {
        productReposity.deleteById(id);
    }

}
