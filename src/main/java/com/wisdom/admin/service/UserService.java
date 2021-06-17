package com.wisdom.admin.service;


import com.wisdom.admin.domain.User;

/**
 * description: 该文件说明
 *
 * @author crm
 * @version 1.0
 * @date 2021/4/17
 */
public interface UserService {

    /**
     * 查询用户
     * @param username
     * @return
     */
    User findByUsername(String username);

    /**
     * 查询用户详情
     * @param id
     * @return
     */
    User findById(Long id);

}
