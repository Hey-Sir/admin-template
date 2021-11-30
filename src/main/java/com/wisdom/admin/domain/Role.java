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
@Table(name = "sec_role")
public class Role extends IdentityDomain {

    private String name;

    private String description;

}
