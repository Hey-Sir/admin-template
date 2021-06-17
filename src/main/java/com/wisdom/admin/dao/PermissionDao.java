package com.wisdom.admin.dao;

import com.wisdom.admin.domain.Permission;
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
public interface PermissionDao {

    /**
     * 根据角色ID获取所有权限
     * @param roleIds
     * @return
     */
    List<Permission> selectByRoleIdList(List<Long> roleIds);

}
