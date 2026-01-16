package com.wym.mp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wym.mp.domain.pojo.User;
import com.wym.mp.mapper.UserMapper;
import com.wym.mp.service.IUserService;

public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {


    @Override
    public void deductBalanceById(Integer id, Integer money) {
        //1.查询用户
        User user = this.getById(id);
        if (user == null) {
            throw new RuntimeException("用户不存在");
        }
        //3.校验余额

        //4.更新用户余额


        baseMapper.detactBalanceById(id, money);

    }
}
