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
@Table(name = "sec_user")
public class User extends IdentityDomain {

    private String username;

    private String password;

    private String nickname;

    private String phone;

    private String email;

    private Date birthday;

    /**
     * 性别，男-1，女-2
     */
    private Integer sex;

    /**
     * 状态，启用-1，禁用-0
     */
    private Integer status;
}
