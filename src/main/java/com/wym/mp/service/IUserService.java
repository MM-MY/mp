package com.wym.mp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wym.mp.domain.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface IUserService extends IService<User> {
    void deductBalanceById(Integer id, Integer money);
}
