package com.wisdom.admin.security;


import com.wisdom.admin.common.Status;
import com.wisdom.admin.domain.Permission;
import com.wisdom.admin.domain.Role;
import com.wisdom.admin.domain.User;
import com.wisdom.admin.service.PermissionService;
import com.wisdom.admin.service.RoleService;
import com.wisdom.admin.service.UserService;
import com.wisdom.admin.vo.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * description: 自定义UserDetails查询
 *
 * @author crm
 * @version 1.0
 * @date 2021/4/13
 */
@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private RoleService roleService;

    @Autowired
    private UserService userService;

    @Autowired
    private PermissionService permissionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(Status.USERNAME_PASSWORD_ERROR.getMessage());
        }
        List<Role> roles = roleService.selectByUserId(user.getId());
        List<Long> roleIds = roles.stream()
                .map(Role::getId)
                .collect(Collectors.toList());
        List<Permission> permissions = permissionService.selectByRoleIdList(roleIds);
        return UserPrincipal.create(user, roles, permissions);
    }
}
