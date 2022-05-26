package com.fy.fyblog.entity.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author: fy
 * @create: 2022-05-16 19:54
 **/
@Data
public class LoginDto implements Serializable {
    @NotBlank(message = "昵称不能为空")
    private String username;

    @NotBlank(message = "密码不能为空")
    private String password;
}
