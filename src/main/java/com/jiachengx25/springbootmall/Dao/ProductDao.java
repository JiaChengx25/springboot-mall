package com.jiachengx25.springbootmall.Dao;

import com.jiachengx25.springbootmall.Model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
