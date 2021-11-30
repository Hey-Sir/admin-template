package com.wisdom.admin.domain;

import lombok.*;
import lombok.experimental.Accessors;

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
@Table(name = "sec_permission")
public class Permission extends IdentityDomain {

    private String name;

    private String url;

    private Integer type;

    private String permission;

    private String method;

    private Integer sort;

    private Long parentId;

}
