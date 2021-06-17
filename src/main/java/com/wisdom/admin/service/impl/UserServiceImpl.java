package com.wisdom.admin.service.impl;

import com.wisdom.admin.dao.UserDao;
import com.wisdom.admin.domain.User;
import com.wisdom.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description: 该文件说明
 *
 * @author crm
 * @version 1.0
 * @date 2021/4/17
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao dao;

    @Override
    public User findByUsername(String username) {
        return dao.findByUsername(username);
    }

    @Override
    public User findById(Long id) {
        return dao.findById(id);
    }
}
