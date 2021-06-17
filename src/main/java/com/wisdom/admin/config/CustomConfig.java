package com.wisdom.admin.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * description: 该文件说明
 *
 * @author crm
 * @version 1.0
 * @date 2021/4/13
 */
@ConfigurationProperties(prefix = "custom.config")
@Data
@Component
public class CustomConfig {

    private IgnoreConfig ignores;

}
