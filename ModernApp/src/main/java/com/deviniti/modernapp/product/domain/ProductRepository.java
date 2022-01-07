package com.deviniti.modernapp.product.domain;

import com.deviniti.modernapp.product.model.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

interface ProductRepository extends CrudRepository<Product, Long> {


    List<Product> findAll();

}
