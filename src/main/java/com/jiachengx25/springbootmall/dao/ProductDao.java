package com.jiachengx25.springbootmall.dao;

import com.jiachengx25.springbootmall.dto.ProductRequest;
import com.jiachengx25.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
