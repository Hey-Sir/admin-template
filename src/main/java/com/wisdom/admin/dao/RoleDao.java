package com.wisdom.admin.dao;

import com.wisdom.admin.domain.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * description: 该文件说明
 *
 * @author crm
 * @version 1.0
 * @date 2021/4/13
 */
@Repository
@Mapper
public interface RoleDao {

    /**
     * 查询角色
     * @param userId
     * @return
     */
    List<Role> selectByUserId(Long userId);

}
