package com.jiachengx25.springbootmall.dto;

import com.jiachengx25.springbootmall.constant.ProductCategory;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class ProductRequest {
    @NotNull
    private String productName;
    @NotNull
    private ProductCategory category;
    @NotNull
    private String imageUrl;
    @NotNull
    private int price;
    @NotNull
    private int stock;

    private String description;
}
