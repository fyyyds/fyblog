package com.fy.fyblog.controller;


import com.fy.fyblog.common.lang.Result;
import com.fy.fyblog.entity.User;
import com.fy.fyblog.service.UserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author fy
 * @since 2022-05-11
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequiresAuthentication
    @GetMapping("/index")
    public Object index() {
        User user = userService.getById(1L);
        return Result.succ(user);
    }

    @PostMapping("/save")
    public Object save(@Validated @RequestBody User user) {

        return Result.succ(user);
    }

}
