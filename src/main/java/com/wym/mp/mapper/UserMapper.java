package com.wym.mp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.wym.mp.domain.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface UserMapper extends BaseMapper<User> {


    void detactBalanceById(@Param("id") Integer id,@Param("money") Integer money);
}
