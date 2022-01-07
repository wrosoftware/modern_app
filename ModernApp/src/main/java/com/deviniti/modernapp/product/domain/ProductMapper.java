package com.deviniti.modernapp.product.domain;

import com.deviniti.modernapp.product.model.dto.NewProductRequest;
import com.deviniti.modernapp.product.model.dto.ProductResponse;
import com.deviniti.modernapp.product.model.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
interface ProductMapper {

    Product mapToEntity(NewProductRequest request);
    ProductResponse mapToResponse(Product product);

}
