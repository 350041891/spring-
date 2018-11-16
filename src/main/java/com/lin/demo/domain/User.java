package com.lin.demo.domain;

import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author lhy
 * @date 2018/11/13 16:04
 */
@Document(indexName = "movie",type="user")
public class User {
    private Integer id;
    private Integer age;
    private String name;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
