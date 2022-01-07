package com.deviniti.modernapp.product.domain;

import com.deviniti.modernapp.product.ProductApi;
import com.deviniti.modernapp.product.model.dto.NewProductRequest;
import com.deviniti.modernapp.product.model.dto.ProductResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
class ProductFacade implements ProductApi {

    private final ProductService productService;

    @Override
    public List<ProductResponse> getAllProducts() {
        return productService.getAllProducts();
    }

    @Override
    public ProductResponse createNewProduct(NewProductRequest request) {
        return productService.createNewProduct(request);
    }
}
