package com.deviniti.modernapp.common.annotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@RestController
@RequestMapping()
public @interface ApiRestController {

    @AliasFor(annotation = RequestMapping.class, attribute = "value")
    String value();
}
