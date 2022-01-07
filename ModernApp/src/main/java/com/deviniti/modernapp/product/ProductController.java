package com.deviniti.modernapp.product;

import com.deviniti.modernapp.common.annotation.ApiRestController;
import com.deviniti.modernapp.product.model.dto.NewProductRequest;
import com.deviniti.modernapp.product.model.dto.ProductResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

@ApiRestController("/product")
@AllArgsConstructor
class ProductController {

    private final ProductApi productApi;

    @GetMapping
    public List<ProductResponse> getAll(){
        return productApi.getAllProducts();
    }

    @PostMapping
    public ProductResponse createNewProduct(@RequestBody @Valid NewProductRequest request) {
        return productApi.createNewProduct(request);
    }
}
