package com.wisdom.admin.domain.unionkey;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * description: 用户-角色联合主键
 *
 * @author crm
 * @version 1.0
 * @date 2021/11/30
 */
@Embeddable
@Data
public class UserRoleKey implements Serializable {

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 角色id
     */
    private Long roleId;

}
