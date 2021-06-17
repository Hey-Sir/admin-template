package com.wisdom.admin.service.impl;

import com.wisdom.admin.dao.RoleDao;
import com.wisdom.admin.domain.Role;
import com.wisdom.admin.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description: 该文件说明
 *
 * @author crm
 * @version 1.0
 * @date 2021/4/18
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao dao;

    @Override
    public List<Role> selectByUserId(Long userId) {
        return dao.selectByUserId(userId);
    }
}
