package com.wisdom.admin.config;

import com.wisdom.admin.vo.UserPrincipal;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

/**
 * description: 该文件说明
 *
 * @author crm
 * @version 1.0
 * @date 2021/11/29
 */
@Configuration
public class UserAuditor implements AuditorAware<Long> {

    @Override
    public Optional<Long> getCurrentAuditor() {
        try {
            UserPrincipal principal = (UserPrincipal) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

            return Optional.ofNullable(principal.getId());
        }catch (Exception e) {

            return Optional.ofNullable(0L);
        }

    }
}
