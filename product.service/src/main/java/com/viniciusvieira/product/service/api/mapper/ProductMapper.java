package com.viniciusvieira.product.service.api.mapper;

import com.viniciusvieira.product.service.api.representantion.model.request.ProductRequest;
import com.viniciusvieira.product.service.api.representantion.model.response.ProductResponse;
import com.viniciusvieira.product.service.domain.model.Product;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProductMapper {
    private final ModelMapper modelMapper;

    public Product toDomainProduct(ProductRequest productRequest){
        return modelMapper.map(productRequest, Product.class);
    }

    public ProductResponse toProductResponse(Product product){
        return modelMapper.map(product, ProductResponse.class);
    }

    public List<ProductResponse> toListProductResponse(List<Product> products){
        return products.stream().map(this::toProductResponse).toList();
    }
}
