package com.wisdom.admin.domain;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * description: 实体通用父类
 *
 * @author crm
 * @version 1.0
 * @date 2021/11/29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class IdentityDomain implements Serializable {

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private Long id;

    private String remark;

    @CreatedDate
    private Date createTime;

    @LastModifiedDate
    private Date updateTime;

    @CreatedBy
    private Long createUser;

    @LastModifiedBy
    private Long updateUser;

    private Boolean isDelete = false;

}
