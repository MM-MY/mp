package com.wym.mp.controller;


import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wym.mp.domain.dto.UserFormDTO;
import com.wym.mp.domain.pojo.User;
import com.wym.mp.domain.vo.UserVO;
import com.wym.mp.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "用户管理")
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private static IUserService userService;

    @PostMapping
    @ApiOperation("新增用户接口")
    public  void saveUser(@RequestBody  UserFormDTO userFormDTO){

        //1.DTO 拷贝到 POJO
        User user = BeanUtil.copyProperties(userFormDTO, User.class);
        //2.保存
        userService.save(user);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除用户接口")
    public  void deleteUserById(@ApiParam("用户ID") @PathVariable("id") Integer id){
        userService.removeById(id);
    }

    @GetMapping("/{id}")
    @ApiOperation("根据ID查询用户接口")
    public UserVO selectUserById(@ApiParam("用户ID") @PathVariable("id") Integer id){
        User user = userService.getById(id);
        return BeanUtil.copyProperties(user, UserVO.class);
    }

    @GetMapping()
    @ApiOperation("根据ID集合查询用户接口")
    public List<UserVO> selectUserListById(@ApiParam("用户ID集合") @RequestParam List<Integer> ids){
        List<User> users = userService.listByIds(ids);
        return BeanUtil.copyToList(users, UserVO.class);
    }


    @PutMapping("/{id}/deduction/{money}")
    @ApiOperation("根据ID集合查询用户接口")
    public void deductBalanceById(@ApiParam("用户ID") @PathVariable("id") Integer id,
                            @ApiParam("扣减金额") @PathVariable("money") Integer money){
        userService.deductBalanceById(id, money);
       

    }


}
