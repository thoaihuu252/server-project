package com.itboy.DACNPM.Service.Interface;

import com.itboy.DACNPM.responses.ProductResponse;
import org.springframework.data.domain.Page;
import com.itboy.DACNPM.models.*;
import com.itboy.DACNPM.dtos.*;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface IProductService {
    Product createProduct(ProductDTO productDTO) throws Exception;
    Product getProductById(long id) throws Exception;

    Page<ProductResponse> getAllProducts(PageRequest pageRequest);

    Product updateProduct(long id, ProductDTO productDTO) throws Exception;
    void deleteProduct(long id);
    Page<ProductResponse> getAllProductsByName(PageRequest pageRequest,String name);


}
