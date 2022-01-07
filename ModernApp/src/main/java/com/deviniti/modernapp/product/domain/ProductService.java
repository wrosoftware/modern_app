package com.deviniti.modernapp.product.domain;

import com.deviniti.modernapp.product.model.dto.NewProductRequest;
import com.deviniti.modernapp.product.model.dto.ProductResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;


    public List<ProductResponse> getAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(productMapper::mapToResponse)
                .collect(toList());
    }

    public ProductResponse createNewProduct(NewProductRequest request) {
        return Optional.ofNullable(request)
                .map(productMapper::mapToEntity)
                .map(productRepository::save)
                .map(productMapper::mapToResponse)
                .orElse(null);
    }
}
