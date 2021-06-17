package com.wisdom.admin.common;

/**
 * description: REST API 错误码接口
 *
 * @author crm
 * @version 1.0
 * @date 2021/4/13
 */
public interface IStatus {

    /**
     * 状态码
     *
     * @return 状态码
     */
    Integer getCode();

    /**
     * 返回信息
     *
     * @return 返回信息
     */
    String getMessage();

}
