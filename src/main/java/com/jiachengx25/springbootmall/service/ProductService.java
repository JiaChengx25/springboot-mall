package com.jiachengx25.springbootmall.service;

import com.jiachengx25.springbootmall.dto.ProductRequest;
import com.jiachengx25.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
