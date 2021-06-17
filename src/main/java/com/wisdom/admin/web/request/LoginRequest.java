package com.wisdom.admin.web.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * description: 登录请求参数
 *
 * @author crm
 * @version 1.0
 * @date 2021/4/14
 */
@Data
public class LoginRequest {

    /**
     * 用户名或邮箱或手机号
     */
    @NotBlank(message = "用户名不能为空")
    private String username;

    /**
     * 密码
     */
    @NotBlank(message = "密码不能为空")
    private String password;

    /**
     * 记住我
     */
    private Boolean rememberMe = false;

}
