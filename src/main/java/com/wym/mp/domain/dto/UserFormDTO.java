package com.wym.mp.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "用户表单实体")
public class UserFormDTO {

    @Schema(description = "用户id")
    private Integer id;
    @Schema(description = "用户名")
    private String username;
    @Schema(description = "密码")
    private String password;
    @Schema(description = "角色")
    private Integer role;
    @Schema(description = "注册手机号")
    private String phone;
    @Schema(description = "详细信息，JSON风格")
    private String info;
    @Schema(description = "账户余额")
    private Integer balance;


}
