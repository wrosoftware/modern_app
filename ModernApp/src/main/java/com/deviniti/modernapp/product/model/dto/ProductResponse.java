package com.deviniti.modernapp.product.model.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ProductResponse {

    private String name;
    private String description;

}
