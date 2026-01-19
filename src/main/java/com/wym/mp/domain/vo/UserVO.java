package com.wym.mp.domain.vo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "用户vo实体")
public class UserVO {

    @Schema(description = "用户id")
    private Integer id;
    @Schema(description = "用户名")
    private String username;
    @Schema(description = "详细信息，JSON风格")
    private String info;
    @Schema(description = "账户余额")
    private Integer balance;
}
