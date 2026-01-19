package com.wym.mp.controller;


import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wym.mp.domain.dto.UserFormDTO;
import com.wym.mp.domain.pojo.User;
import com.wym.mp.domain.vo.UserVO;
import com.wym.mp.service.IUserService;

import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "用户管理")
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private static IUserService userService;

    @PostMapping
    @Operation(summary = "新增用户接口")
    public  void saveUser(@RequestBody  UserFormDTO userFormDTO){

        //1.DTO 拷贝到 POJO
        User user = BeanUtil.copyProperties(userFormDTO, User.class);
        //2.保存
        userService.save(user);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "删除用户接口")
    public  void deleteUserById(@Parameter(description ="用户ID") @PathVariable("id") Integer id){
        userService.removeById(id);
    }

    @GetMapping("/{id}")
    @Operation(summary = "根据ID查询用户接口")
    public UserVO selectUserById(@Parameter(description ="用户ID") @PathVariable("id") Integer id){
        User user = userService.getById(id);
        return BeanUtil.copyProperties(user, UserVO.class);
    }

    @GetMapping()
    @Operation(summary = "根据ID集合查询用户接口")
    public List<UserVO> selectUserListById(@Parameter(description ="用户ID集合") @RequestParam List<Integer> ids){
        List<User> users = userService.listByIds(ids);
        return BeanUtil.copyToList(users, UserVO.class);
    }


    @PutMapping("/{id}/deduction/{money}")
    @Operation(summary = "根据ID集合查询用户接口")
    public void deductBalanceById(@Parameter(description ="用户ID") @PathVariable("id") Integer id,
                            @Parameter(description ="扣减金额") @PathVariable("money") Integer money){
        userService.deductBalanceById(id, money);
       

    }


}
