package com.deviniti.modernapp.product;

import com.deviniti.modernapp.product.model.dto.NewProductRequest;
import com.deviniti.modernapp.product.model.dto.ProductResponse;

import java.util.List;

public interface ProductApi {

    List<ProductResponse> getAllProducts();

    ProductResponse createNewProduct(NewProductRequest request);
}
