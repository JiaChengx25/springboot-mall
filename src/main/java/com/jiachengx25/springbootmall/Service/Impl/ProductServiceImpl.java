package com.jiachengx25.springbootmall.Service.Impl;

import com.jiachengx25.springbootmall.Dao.ProductDao;
import com.jiachengx25.springbootmall.Model.Product;
import com.jiachengx25.springbootmall.Service.ProductService;
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
}
