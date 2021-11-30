package com.wisdom.admin.web;

import com.wisdom.admin.common.ApiResponse;
import com.wisdom.admin.domain.Role;
import com.wisdom.admin.domain.User;
import com.wisdom.admin.service.RoleService;
import com.wisdom.admin.service.UserService;
import com.wisdom.admin.utils.OrikaMapper;
import com.wisdom.admin.vo.UserPrincipal;
import com.wisdom.admin.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * description: 该文件说明
 *
 * @author crm
 * @version 1.0
 * @date 2021/4/17
 */
@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    /**
     * 用户信息
     * @param authentication
     * @return
     */
    @GetMapping("/info")
    public ApiResponse info(Authentication authentication) {
        UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();
        User user = userService.findById(userPrincipal.getId());
        List<Role> roles = roleService.selectByUserId(user.getId());
        UserVO map = OrikaMapper.map(user, UserVO.class);
        map.setRoles(roles);
        return ApiResponse.ofSuccess(map);
    }

}
