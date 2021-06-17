package com.wisdom.admin.domain;

import lombok.*;
import lombok.experimental.Accessors;

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
public class Role {

    private Long id;

    private String name;

    private String description;

    private Date createTime;

    private String createUser;

    private Date updateTime;

    private String updateUser;

    private Boolean isDelete;

}