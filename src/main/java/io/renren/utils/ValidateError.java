/**
 * Copyright (C), 2015-2020, hkrt
 * FileName: ValidateError
 * Author:   gengxin.hao
 * Date:     2020/6/4 13:28
 * Description:
 * History:
 */
package io.renren.utils;

/**
 * 〈〉
 *
 * @author gengxin.hao
 * @create 2022/10/21
 * @since 1.0.0
 */
public class ValidateError {

    private String field;
    private String message;
    private Object rejectedValue;

    public ValidateError() {
    }

    public String getField() {
        return this.field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getRejectedValue() {
        return this.rejectedValue;
    }

    public void setRejectedValue(Object rejectedValue) {
        this.rejectedValue = rejectedValue;
    }

    @Override
    public String toString() {
        return "ValidateError{field='" + this.field + '\'' + ", message='" + this.message + '\'' + ", rejectedValue=" + this.rejectedValue + '}';
    }
}
