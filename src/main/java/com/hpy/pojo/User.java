package com.hpy.pojo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Author: hpy
 * Description: 用户
 */
@Getter@Setter
public class User implements Serializable {

    private Integer id;
    private String username;
    private String password;

}
