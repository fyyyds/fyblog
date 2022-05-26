package com.fy.fyblog.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: fy
 * @create: 2022-05-16 18:08
 **/
@Data
public class AccountProfile implements Serializable {
    private Long id;
    private String username;
    private String avatar;
}
