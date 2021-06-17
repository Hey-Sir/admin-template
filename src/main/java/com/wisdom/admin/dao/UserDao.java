package com.wisdom.admin.dao;

import com.wisdom.admin.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * description: 该文件说明
 *
 * @author crm
 * @version 1.0
 * @date 2021/4/13
 */
@Repository
@Mapper
public interface UserDao {

    /**
     * 查询用户
     * @param username
     * @return
     */
    User findByUsername(String username);

    /**
     * id
     * @param id
     * @return
     */
    User findById(Long id);

}
