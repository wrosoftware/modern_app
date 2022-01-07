package com.deviniti.modernapp.common.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = ProductNameValidator.class)
public @interface ProductName {

    String message() default "Incorrect product name";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    int minLength();
}
