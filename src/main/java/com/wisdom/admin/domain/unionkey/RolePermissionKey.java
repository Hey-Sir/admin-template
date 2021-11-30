package com.wisdom.admin.domain.unionkey;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * description: 角色-权限联合主键
 *
 * @author crm
 * @version 1.0
 * @date 2021/11/30
 */
@Data
@Embeddable
public class RolePermissionKey implements Serializable {

    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 权限id
     */
    private Long permissionId;

}
