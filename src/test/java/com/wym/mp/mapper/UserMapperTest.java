package com.wym.mp.mapper;

import com.wym.mp.domain.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert(){
        User user = new User();

        user.setPassword("123456");
        user.setRole(1);

        userMapper.insert(user);
    }
}
