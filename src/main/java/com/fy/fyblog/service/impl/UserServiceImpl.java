package com.fy.fyblog.service.impl;

import com.fy.fyblog.entity.User;
import com.fy.fyblog.mapper.UserMapper;
import com.fy.fyblog.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fy
 * @since 2022-05-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
