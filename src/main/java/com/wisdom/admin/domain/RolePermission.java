package com.wisdom.admin.domain;

import com.wisdom.admin.domain.unionkey.RolePermissionKey;
import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * description: 该文件说明
 *
 * @author crm
 * @version 1.0
 * @date 2021/4/13
 */
@Data
@ToString
@Accessors(chain = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sec_role_permission")
public class RolePermission {

    /**
     * 主键
     */
    @EmbeddedId
    private RolePermissionKey id;

}
