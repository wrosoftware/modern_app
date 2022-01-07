package com.deviniti.modernapp.product.model.dto;

import com.deviniti.modernapp.common.validator.ProductName;
import lombok.Value;

@Value
public class NewProductRequest {

    @ProductName(minLength = 5)
    private String name;
    private String description;

}
