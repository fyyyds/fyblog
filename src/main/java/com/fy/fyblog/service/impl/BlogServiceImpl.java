package com.fy.fyblog.service.impl;

import com.fy.fyblog.entity.Blog;
import com.fy.fyblog.mapper.BlogMapper;
import com.fy.fyblog.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
