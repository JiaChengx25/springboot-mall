package com.jiachengx25.springbootmall.dto;

import com.jiachengx25.springbootmall.constant.ProductCategory;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductQueryParams {

    private ProductCategory category;

    private String search;

    private String OrderBy;

    private String Sort;
}
