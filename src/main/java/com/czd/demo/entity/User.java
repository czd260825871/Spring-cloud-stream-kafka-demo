package com.czd.demo.entity;

import java.time.LocalDateTime;

/**
 * @author admin
 */
public class User {

    private String name;

    private Integer gender;

    private LocalDateTime birthday;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }
}
