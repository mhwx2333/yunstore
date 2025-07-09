package com.mh.yun.service.impl;

import com.mh.yun.entity.User;
import com.mh.yun.mapper.UserMapper;
import com.mh.yun.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mhwx
 * @since 2025-07-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
