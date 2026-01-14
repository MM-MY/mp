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



    // 手动添加 setter 方法
    public void setName(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setRole(Integer role) {
        this.role = role;
    }

    // 也可以添加 getter 方法
    public String getName() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

