package com.jiachengx25.springbootmall.service.Impl;

import com.jiachengx25.springbootmall.dao.ProductDao;
import com.jiachengx25.springbootmall.dto.ProductRequest;
import com.jiachengx25.springbootmall.model.Product;
import com.jiachengx25.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
