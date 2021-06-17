package com.wisdom.admin.exception;

import com.wisdom.admin.common.BaseException;
import com.wisdom.admin.common.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * description: 该文件说明
 *
 * @author crm
 * @version 1.0
 * @date 2021/4/13
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SecurityException extends BaseException {

    public SecurityException(Status status) {
        super(status);
    }

    public SecurityException(Status status, Object data) {
        super(status, data);
    }

    public SecurityException(Integer code, String message) {
        super(code, message);
    }

    public SecurityException(Integer code, String message, Object data) {
        super(code, message, data);
    }

}
