package com.wisdom.admin.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * description: JWT 配置
 *
 * @author crm
 * @version 1.0
 * @date 2021/4/13
 */
@ConfigurationProperties(prefix = "jwt.config")
@Data
@Component
public class JwtConfig {

    /**
     * jwt 加密 key，默认值：xkcoding.
     */
    private String key = "xkcoding";

    /**
     * jwt 过期时间，默认值：600000 {@code 10 分钟}.
     */
    private Long ttl = 600000L;

    /**
     * 开启 记住我 之后 jwt 过期时间，默认值 604800000 {@code 7 天}
     */
    private Long remember = 604800000L;

}
