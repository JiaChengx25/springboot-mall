package com.jiachengx25.springbootmall.dao;

import com.jiachengx25.springbootmall.constant.ProductCategory;
import com.jiachengx25.springbootmall.dto.ProductRequest;
import com.jiachengx25.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
