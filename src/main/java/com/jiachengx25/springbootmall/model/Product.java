package com.jiachengx25.springbootmall.model;

import com.jiachengx25.springbootmall.constant.ProductCategory;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Product {
    private Integer productId;
    private String productName;
    private ProductCategory category;
    private String imageUrl;
    private int price;
    private int stock;
    private String description;
    private Date createdDate;
    private Date lastModifiedDate;
}
