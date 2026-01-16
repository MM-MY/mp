package com.wym.mp.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "用户表单实体")
public class UserFormDTO {

    @ApiModelProperty(value = "用户id")
    private Integer id;
    @ApiModelProperty(value = "用户名")
    private String username;
    @ApiModelProperty(value = "密码")
    private String password;
    @ApiModelProperty(value = "角色")
    private Integer role;
    @ApiModelProperty(value = "注册手机号")
    private String phone;
    @ApiModelProperty(value = "详细信息，JSON风格")
    private String info;
    @ApiModelProperty(value = "账户余额")
    private Integer balance;


}
