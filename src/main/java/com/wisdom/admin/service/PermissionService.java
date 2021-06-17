package com.wisdom.admin.service;

import com.wisdom.admin.domain.Permission;

import java.util.List;

/**
 * description: 该文件说明
 *
 * @author crm
 * @version 1.0
 * @date 2021/6/17
 */
public interface PermissionService {

    /**
     * 根据角色ID获取所有权限
     * @param roleIds
     * @return
     */
    List<Permission> selectByRoleIdList(List<Long> roleIds);

}
