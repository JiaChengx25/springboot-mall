package com.jiachengx25.springbootmall.model;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class User {
    private Integer userId;
    private String email;
    private String password;
    private Date createdDate;
    private Date lastModifiedDate;
}
