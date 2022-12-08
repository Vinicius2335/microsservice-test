package com.viniciusvieira.product.service.domain.service;

import com.viniciusvieira.product.service.api.mapper.ProductMapper;
import com.viniciusvieira.product.service.api.representantion.model.request.ProductRequest;
import com.viniciusvieira.product.service.api.representantion.model.response.ProductResponse;
import com.viniciusvieira.product.service.domain.model.Product;
import com.viniciusvieira.product.service.domain.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public void createdProduct(ProductRequest productRequest) {
        Product productToSave = productMapper.toDomainProduct(productRequest);

        productRepository.save(productToSave);
        log.info("Product {} is saved", productToSave.getId());
    }

    public List<ProductResponse> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return productMapper.toListProductResponse(products);
    }
}
