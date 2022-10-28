/**
 * Copyright (C), 2015-2022
 * FileName: ErrorCode
 * Author:   gengxin.hao
 * Date:     2022/10/25 13:51
 * Description:
 * History:
 */
package io.renren.utils;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.List;

/**
 * 〈〉
 *
 * @author gengxin.hao
 * @create 2022/10/25
 * @since 1.0.0
 */
public class ErrorCode {

    private final String code;
    private final String msg;
    private final String status;

    public ErrorCode(BindingResult result) {
        List<ObjectError> list = result.getAllErrors();
        for(ObjectError error: list){
            if ("typeMismatch".equals(error.getCode())) {
                this.code = ResponseCode.PARAM_INVALID.getRspCode();
                this.msg = ResponseCode.PARAM_INVALID.getRspMsg();
                this.status = ResponseCode.PARAM_INVALID.name();
                return;
            }
            this.code = ResponseCode.PARAM_INVALID.getRspCode();
            this.msg = error.getDefaultMessage();
            this.status = ResponseCode.PARAM_INVALID.name();
            return;
        }
        this.code = "";
        this.msg = "";
        this.status = "";
    }

    public ErrorCode(String code, String msg, String status) {
        this.code = code;
        this.msg = msg;
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public String getStatus() {
        return status;
    }

}
