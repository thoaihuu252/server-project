package com.itboy.DACNPM.Controller;

import com.itboy.DACNPM.Model.Product;
import com.itboy.DACNPM.Service.Interface.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/product")
public class ProductController {
    //http://localhost:8080/api/product
    @Autowired
    private ProductService productService;
    @GetMapping("/getAll")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @PostMapping("/add")
    public String addProduct(@RequestBody Product product){
        productService.saveProduct(product);
        return "Đã thêm";
    }
    @GetMapping("/getId/{id}")
    public Optional<Product> getProducById(@PathVariable("id") long id){
        return productService.getProductById(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") long id){
        productService.deleteProduct(id);
        return "Đã xóa ";
    }

}