package com.wisdom.admin.repository;

import com.wisdom.admin.domain.RolePermission;
import com.wisdom.admin.domain.unionkey.RolePermissionKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * description: 该文件说明
 *
 * @author crm
 * @version 1.0
 * @date 2021/6/29
 */
@Repository
public interface RolePermissionRepository extends JpaRepository<RolePermission, RolePermissionKey>, JpaSpecificationExecutor<RolePermission> {
}
