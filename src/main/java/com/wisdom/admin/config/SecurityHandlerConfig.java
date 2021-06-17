package com.wisdom.admin.config;

import com.wisdom.admin.common.Status;
import com.wisdom.admin.utils.ResponseUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.access.AccessDeniedHandler;

/**
 * description: Security 结果处理配置
 *
 * @author crm
 * @version 1.0
 * @date 2021/4/13
 */
@Configuration
public class SecurityHandlerConfig {

    @Bean
    public AccessDeniedHandler accessDeniedHandler() {
        return ((httpServletRequest, httpServletResponse, e) -> ResponseUtil.renderJson(httpServletResponse, Status.ACCESS_DENIED,null));
    }

}
