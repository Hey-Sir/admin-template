package com.wisdom.admin.service.impl;

import com.wisdom.admin.dao.PermissionDao;
import com.wisdom.admin.domain.Permission;
import com.wisdom.admin.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description: 该文件说明
 *
 * @author crm
 * @version 1.0
 * @date 2021/6/17
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionDao dao;

    @Override
    public List<Permission> selectByRoleIdList(List<Long> roleIds) {
        return dao.selectByRoleIdList(roleIds);
    }
}
