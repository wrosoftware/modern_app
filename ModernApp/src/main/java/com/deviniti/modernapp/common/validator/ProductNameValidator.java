package com.deviniti.modernapp.common.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

class ProductNameValidator implements ConstraintValidator<ProductName, String> {

    private int minLength;

    @Override
    public void initialize(ProductName constraintAnnotation) {
        this.minLength = constraintAnnotation.minLength();
    }

    @Override
    public boolean isValid(String productName, ConstraintValidatorContext constraintValidatorContext) {
        return productName != null && productName.length() >= minLength;
    }
}
