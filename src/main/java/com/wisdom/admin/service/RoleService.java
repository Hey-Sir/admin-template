package com.wisdom.admin.service;

import com.wisdom.admin.domain.Role;

import java.util.List;

/**
 * description: 该文件说明
 *
 * @author crm
 * @version 1.0
 * @date 2021/4/18
 */
public interface RoleService {

    /**
     * find
     * @param userId
     * @return
     */
    List<Role> selectByUserId(Long userId);

}
