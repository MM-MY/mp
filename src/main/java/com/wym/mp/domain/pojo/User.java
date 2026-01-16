package com.wym.mp.domain.pojo;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("xxl_job_user")
public class User {
    @TableField(exist = false)
    private Integer id;
    private String username;
    private String password;
    private Integer role;



}

