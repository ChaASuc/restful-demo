package com.deschen.restful.restfuldemo.pojo;

import lombok.Data;

import javax.persistence.Id;

/**
 * @Author deschen
 * @Create 2019/8/11
 * @Description
 * @Since 1.0.0
 */
@Data
public class User {
    @Id
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
